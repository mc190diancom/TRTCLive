package com.miu30.common.glide.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * 作者：wang.
 * 邮箱：forwlwork@gmail.com
 * <p>
 * 该类仅适用于稽查项目中通过FTP来获取图片
 */
public class StrengthFTPClient extends FTPClient {
    private int passiveModeDataTimeout = 0;
    private String hostname;
    private int port;

    @Override
    public void connect(String hostname, int port) throws IOException {
        this.hostname = hostname;
        this.port = port;
        super.connect(hostname, port);
    }

    @Override
    protected Socket _openDataConnection_(String command, String arg) throws IOException {
        if (getDataConnectionMode() != ACTIVE_LOCAL_DATA_CONNECTION_MODE &&
                getDataConnectionMode() != PASSIVE_LOCAL_DATA_CONNECTION_MODE) {
            return null;
        }

        if (getDataConnectionMode() == ACTIVE_LOCAL_DATA_CONNECTION_MODE) {
            //主动模式获取连接，直接使用父类的方法
            return super._openDataConnection_(command, arg);
        } else {
            //被动模式获取连接
            return opendDataConnectionByPassiveMode(command, arg);
        }
    }

    private Socket opendDataConnectionByPassiveMode(String command, String arg) throws IOException {
        final boolean isInet6Address = getRemoteAddress() instanceof Inet6Address;

        boolean attemptEPSV = isUseEPSVwithIPv4() || isInet6Address;
        if (attemptEPSV && epsv() == FTPReply.ENTERING_EPSV_MODE) {
            _parseExtendedPassiveModeReply(_replyLines.get(0));
        } else {
            if (isInet6Address) {
                return null; // Must use EPSV for IPV6
            }
            // If EPSV failed on IPV4, revert to PASV
            if (pasv() != FTPReply.ENTERING_PASSIVE_MODE) {
                return null;
            }
            _parsePassiveModeReply(_replyLines.get(0));
        }

        Socket socket = _socketFactory_.createSocket();

        if (getReceiveDataSocketBufferSize() > 0) {
            socket.setReceiveBufferSize(getReceiveDataSocketBufferSize());
        }
        if (getSendDataSocketBufferSize() > 0) {
            socket.setSendBufferSize(getSendDataSocketBufferSize());
        }

        if (this.passiveModeDataTimeout >= 0) {
            socket.setSoTimeout(this.passiveModeDataTimeout);
        }

        /*
         * TODO:这里就是实际修改的地方
         * 经测试，在被动模式的情况下，通过服务器返回的IP地址和端口号不能使用，会报超时错误
         * 经测试，直接使用 hostname 和 (port + 1) 进行连接，可以正确的获取到图片
         * TODO:该情况只适用于稽查项目
         */
        socket.connect(new InetSocketAddress(this.hostname, this.port + 1), connectTimeout);

        if ((getRestartOffset() > 0) && !restart(getRestartOffset())) {
            socket.close();
            return null;
        }

        if (!FTPReply.isPositivePreliminary(sendCommand(command, arg))) {
            socket.close();
            return null;
        }

        if (isRemoteVerificationEnabled() && !verifyRemote(socket)) {
            socket.close();

            throw new IOException(
                    "Host attempting data connection " + socket.getInetAddress().getHostAddress() +
                            " is not same as server " + getRemoteAddress().getHostAddress());
        }

        return socket;
    }

    public void setPassiveModeDataTimeout(int passiveModeDataTimeout) {
        this.passiveModeDataTimeout = passiveModeDataTimeout;
    }
}
