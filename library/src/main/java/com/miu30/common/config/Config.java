package com.miu30.common.config;

import android.os.Environment;

import com.miu30.common.MiuBaseApp;
import com.miu360.library.BuildConfig;

/**
 * Created by Murphy on 2018/10/8.
 */
public class Config {
    public final static String DIR_PATH = Environment.getExternalStorageDirectory().getPath() + "/jicha/";
    public final static String PATH = Environment.getExternalStorageDirectory().getPath() + "/qh_inspect/";
    public final static String PATHROOT = Environment.getExternalStorageDirectory().getAbsolutePath();
    public final static String FILE_NAME = "inspector.txt";
    public final static String CASE_TEMP = "case.txt";
    public final static String CASE_TEMPS = "cases.txt";
    public final static String FILE_NAME2 = "temp.txt";
    public final static String ID_FILE_NAME = "cardqr.txt";
    public static final String IP = BuildConfig.IP;
    public static final String SERVER_HTTP = "http://";
    public static final String SERVER_BASIC = SERVER_HTTP + IP + BuildConfig.PORT;
    public static final String SERVER = SERVER_BASIC + "requestApi";
    public static final String SERVER_POSITION = SERVER + "/common";
    public static final String SERVER_SAVEINFO = SERVER + "/bs_Taxi";
    public static final String SERVER_ZFRY = SERVER + "/zfry";
    public static final String SERVER_OTHER = SERVER + "/other";
    public static final String SERVER_WAIQIN = SERVER + "/wqxcjcbl";
    public static final String SERVER_BLLIST = SERVER + "/bllist";
    public static final String SERVER_XINXI = SERVER + "/xinxi";
    public static final String SERVER_WEBSERVICE = SERVER + "/webservice";
    public static final String SERVER_DOWNLOAD = SERVER + "/transfers";
    public static final String SERVER_VIDEO = SERVER + "/video";
    public static final String SERVER_TAXIINFO = SERVER + "/app_Taxi";
    public static final String SERVER_SIGN = SERVER + "/sign";
    public static final String SERVER_LOCATION = SERVER + "/vheiclelocation";
    public static final String SERVER_TAXIMETER = SERVER + "/taximeter";
    public static final String FLAG = "2";
    //网约车字典表
    public static final String SERVER_ONLINECAR_DICT = SERVER + "/dict";
    public static final String SERVER_ONLINECAR_ORDER = SERVER_HTTP + IP + ":9879/" + "order/wycInfoOperPrice";
    public static final String SERVER_ONLINECAR_ORDER_TRACK = SERVER_HTTP + IP + ":9879/" + "trajectory/queryTrajectoryHistory";
    public static final String SERVER_ONLINECAR_LOCATION = SERVER_HTTP + IP + ":9879/" + "trajectory/queryTrajectoryRealTime";

    private static final String SERVER_BASIC_ORDER = SERVER_HTTP + IP + ":9879/" + "order";
    private static final String SERVER_BASIC_VEHICLE = SERVER_HTTP + IP + ":9879/" + "vehicle";
    private static final String SERVER_BASIC_DRIVER = SERVER_HTTP + IP + ":9879/" + "driver";
    private static final String SERVER_BASIC_OWNER = SERVER_HTTP + IP + ":9879/" + "owner";
    //订单信息查询
    public static final String SERVER_ORDER = SERVER_BASIC_ORDER + "/wycInfoOrderList";
    //运营补传信息查询
    public static final String SERVER_OPERATION_REUPLOAD = SERVER_BASIC_ORDER + "/wycInfoOrderPrice";
    //通过订单ID查询运营统计信息
    public static final String SERVER_OPERATION_STATISTICAL_BY_ORDER_ID = SERVER_BASIC_ORDER + "/wycInfoOperStatisticsByOrderId";
    //查询运营统计信息
    public static final String SERVER_OPERATION_STATISTICAL = SERVER_BASIC_ORDER + "/wycInfoOperStatistics";
    public static final String SERVER_VEHICLE_BEIAN = SERVER_BASIC_VEHICLE + "/basicInfoVehicleList";
    public static final String SERVER_VEHICLE_SHENPI = SERVER_BASIC_VEHICLE + "/wycInfoVehicleList";

    public static final String SERVER_DRIVER_BEIAN = SERVER_BASIC_DRIVER + "/basicInfoDriverList";
    public static final String SERVER_DRIVER_SHENPI = SERVER_BASIC_DRIVER + "/wycInfoDriverList";

    public static final String SERVER_COMPANY_BEIAN = SERVER_BASIC_OWNER + "/basicInfoOwnerList";
    public static final String SERVER_COMPANY_SHENPI = SERVER_BASIC_OWNER + "/wycInfoOwnerList";
    //备案司机信誉信息
    public static final String SERVER_DRIVER_REPUTATION = SERVER_BASIC_DRIVER + "/basicCreditDriverByIdCode";
    //备案司机培训信息
    public static final String SERVER_DRIVER_TRAIN = SERVER_BASIC_DRIVER + "/basicTrainDriverByIdCode";

    /*public static final String SERVER_BJCRSIGN = "http://" + IP + ":9878/" + "AnyWriteClientToolTest/anyWriteSignPDF";
    public static final String SERVER_ZFRYSIGN = "http://" + IP + ":9878/" + "MssgPdfClientTest/asyncSignAddJob";
    public static final String SERVER_PDFSIGN = "http://" + IP + ":9878/" + "ESSPDFClientToolTest/pdfsign";*/
    public static final String SERVER_BJCRSIGN = SERVER_HTTP + IP + ":9878/" + "anyWriteClient/anyWriteSignPDF";
    //public static final String SERVER_ZFRYSIGN = "http://" + IP + ":9878/" + "pdfClient/asyncSignFirstPerson";
    public static final String SERVER_ZFRYSIGN = SERVER_HTTP + IP + ":9878/" + "pdfClient/asyncSign";
    public static final String SERVER_REFUSESIGN = SERVER_HTTP + IP + ":9878/" + "pdfClient/refusalSign";
    public static final String SERVER_PDFSIGN = SERVER_HTTP + IP + ":9878/" + "pdfCommonSealClient/pdfsign";
    public static final String VIDEO_SRC_IP = "10.212.160.158";
    public static final String VIDEO_DES_IP = "10.252.16.81";


    public final static String path_root = PATHROOT + "/Android/data/" + MiuBaseApp.self.getPackageName() + "/files/";
    public final static String SIGNIMG = "sign.png";
    public final static String SIGNIMG2 = "sign2.png";
    public final static String COMMENTIMG = "comment.png";
    public final static String COMMENTIMG2 = "comment2.png";
    public final static String COMMENTIMG3 = "comment3.png";
    public final static String REFUSESIGN = "refuseSign.png";

    public static final int LAWLOCATION = 1;

    //缓存KEY
    public static final String CASEKEY = "case";//案件
    public static final String UTCKEY = "utc";//时间
    public static final String LIVER = "live";//现场检查笔录
    public static final String PARK = "park";//停车场
    public static final String TIME = "time";//扣车时间
    public static final String CAR = "car";//车辆信息
    public static final String DRIVER = "driver";//被检查人信息
    public static final String JCX = "jcx";//检查项信息
    public static final String LAWTOC = "lawToC";//现场检查笔录需要用到的执法稽查信息
    public static final String JDKH = "jdkh";//监督卡号
    public static final String SFZH = "sfzh";//身份证号
    public static final String AUTHZFZH = "auths";//授权执法账号
    public static final String WSID = "wsid";//文书id

    public static final String PERMISSION = "permission";//权限
    public static final String DISTRICT = "district";//区域
    public static final String HYLB = "hylb";//行业
    public static final String ILLEGALDETAIL = "illegalDetail";//违法行为
    public static final String AGENCYINFOS = "agencyInfos";//机关信息
    public static final String PARKS = "parks";//停车场
    public static final String AGENCYINFOBYZFZH = "agencyOfZFZH";//执法账号机关信息
    public static final String TEAM = "team";//大队列表
    public static final String WFX = "wfx";//违法行为和情形和违法项
    public static final boolean ISEXSIT = false;//是否存在

    public static final int SERVICE_PRINT = 1;
    public static final int SERVICE_CAR = 2;
    public static final int SERVICE_SFZH = 3;
    public static final int SERVICE_INSPECT_INFO = 4;
    public static final int SERVICE_PRINT_LOG = 5;

    public static final String CHOOSE_TYPE_KEY = "choose_type";
    public static final String PRINT_TIMES = "print_times";//打印次数

    //eventbus发送code
    public static final String SELECTADD = "HandLocation";//手动定位
    public static final String ILLEGAL = "Illegal";//违法行为
    public static final String UPDATECASE = "UpdateCase";//更新了案件信息过后，返回对应文书操作
    public static final String UPDATECASESTATUS = "UpdateCaseStatus";//修改通用数据或者文书时间后，后续文书状态改变
    public static final String UPDATEFILENAME = "UpdateFileName";//如果上传文书图片成功后，通知到文书并更新字段，这样可以进行预览
    public static final String SUBMIT = "submit";//如果上传文书图片成功后，通知到文书并更新字段，这样可以进行预览
    public static final String STARTACTIVITY = "StartActivity";//跳转activity
    public static final String UPLOADPHOTO = "UploadPhoto";//交接单用于图片上传通知预览页
    public static final String ORDERBACK = "OrderBackInfo";//订单回传信息
    public static final String DIALOGDIS = "DialogDismiss";//dialog关闭
    public static final String MOVECAMERA = "MoveCamera";//移动摄像头保留信息
    public static final String MOVECAMERARECOVER = "MoveCameraRecover";//移动摄像头信息恢复
    public static final String STARTMOVECAMERVIEW = "StartCameraActivity";//tcp服务传输到mainactivity提醒其开启移动摄像头界面
    public static final String TIPDATA = "tipData";//通知tcp服务传输数据了
    public static final String CLEANDATA = "cleanData";//关闭摄像头时清空数据
    public static final String SYSTEMLOGOUT = "system_logout";//TCP发出退出通知
    public static final String IDCARD = "idCard";//身份证背夹通知
    public static final String IDCARDFAIL = "idCardFail";//身份证背夹通知没有找到设备
    public static final String FINISHACTIVITY = "finishActivity";//关闭页面
    public static final String TPSTARTACTIVITY = "sActivity";//开启页面

    public static final String MAPTRACE = "uploadMapTrace";//更新地图轨迹
    public static final String MAPPLAN = "uploadMapPaln";//更新地图规划轨迹
    public static final String CARTRACE = "carTrace";//车辆轨迹

    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_EMPTY = 1;
    public static final int RESULT_ERROR = 2;

    public static final String ILLEGAL_TAXI = "非法经营巡游车";
    public static final String ILLEGAL_ONLINECAR = "非法经营网约车";
    public static final String TAXI = "巡游车";
    public static final String ONLINECAR = "网约车";

    //约定的每个文书最小时长
    public static final long UTC_LIVERECORD = 4 * 60;//北京市交通执法总队现场检查笔录(路检)
    public static final long UTC_TALKNOTICE = 2 * 60;//北京市交通执法总队谈话通知书
    public static final long UTC_FRISTREGISTER = 4 * 60;//北京市交通执法总队证据先行登记保存通知书
    public static final long UTC_CARDECIDE = 4 * 60;//北京市交通执法总队扣押车辆决定书
    public static final long UTC_LIVETRANSCRIPT = 2 * 60;//北京市交通执法总队现场笔录
    public static final long UTC_ADMINISTRATIVE = 4 * 60;//北京市交通执法总队当场行政处罚决定书(警告)
    public static final long UTC_CARFORM = 2 * 60;//北京市交通执法总队执法暂扣车辆交接单
    public static final long UTC_ZPDZ = 2 * 60;//北京市交通执法总队现场拍照

    //与服务端约定的文书type;文书1.0用到(这个是用的表名；为什么有两个)
    public static final String T_LIVERECORD = "T_BJSJTZFZD_XCJCBL";//北京市交通执法总队现场检查笔录(路检)
    public static final String T_TALKNOTICE = "T_BJSJTZFZD_THTZS";//北京市交通执法总队谈话通知书
    public static final String T_FRISTREGISTER = "T_BJSJTZFZD_ZJXXDJ_BCTZS";//北京市交通执法总队证据先行登记保存通知书
    public static final String T_CARDECIDE = "T_BJSJTZFZD_KYCLJDS";//北京市交通执法总队扣押车辆决定书
    public static final String T_LIVETRANSCRIPT = "T_BJSJTZFZD_XCBL";//北京市交通执法总队现场笔录
    public static final String T_ADMINISTRATIVE = "T_BJSJTZFZD_DCXZCFJDS";//北京市交通执法总队当场行政处罚决定书(警告)
    public static final String T_CARFORM = "T_BJSJTZFZD_ZFZKCLJJD";//北京市交通执法总队执法暂扣车辆交接单
    public static final String T_ZPDZ = "T_BJSJTZFZD_ZPDZ";//北京市交通执法总队现场拍照

    //与服务端约定的文书type;文书1.0用到
    public static final String LIVERECORD = "XCJCBL1";//北京市交通执法总队现场检查笔录(路检)
    public static final String TALKNOTICE = "THTZS";//北京市交通执法总队谈话通知书
    public static final String FRISTREGISTER = "BSCTZS";//北京市交通执法总队证据先行登记保存通知书
    public static final String CARDECIDE = "KYCLJDS";//北京市交通执法总队扣押车辆决定书
    public static final String LIVETRANSCRIPT = "XCBL";//北京市交通执法总队现场笔录
    public static final String ADMINISTRATIVE = "DCXZCFJDS";//北京市交通执法总队当场行政处罚决定书(警告)
    public static final String CARFORM = "CLJJD";//北京市交通执法总队执法暂扣车辆交接单
    public static final String ZPDZ = "ZPDZ";//北京市交通执法总队现场拍照
    public static final String BJCA = "chapter";//公司红章

    //与服务端约定的文书type;文书1.0用到
    public static final String ID_LIVERECORD = "d6b562595aa04fb6b1d91e288c0f5846";//北京市交通执法总队现场检查笔录(路检)
    public static final String ID_TALKNOTICE = "e22671de33bd4e20a8f346f53d2ac44f";//北京市交通执法总队谈话通知书
    public static final String ID_FRISTREGISTER = "612bd85d96af4cebb264f265d2220e7e";//北京市交通执法总队证据先行登记保存通知书
    public static final String ID_CARDECIDE = "16e82e98ef4c4f7e90b08151d20f6f52";//北京市交通执法总队扣押车辆决定书
    public static final String ID_LIVETRANSCRIPT = "e6b230fb5c094aa2a0babc1aaa1eeed7";//北京市交通执法总队现场笔录
    public static final String ID_ADMINISTRATIVE = "575fd68709f246a6b0c068d254a75a04";//北京市交通执法总队当场行政处罚决定书(警告)
    public static final String ID_CARFORM = "a51d884d058344889bd7275b09fbab24";//北京市交通执法总队执法暂扣车辆交接单
    public static final String ID_ZPDZ = "5830a5fb061f40159e866e1124093b3c";//北京市交通执法总队现场拍照

    //与服务端约定的文书type;文书1.0用到
    public static final String STR_LIVERECORD = "现场检查笔录（路检）";//北京市交通执法总队现场检查笔录(路检)
    public static final String STR_TALKNOTICE = "谈话通知书";//北京市交通执法总队谈话通知书
    public static final String STR_FRISTREGISTER = "先行登记通知书";//北京市交通执法总队证据先行登记保存通知书
    public static final String STR_CARDECIDE = "扣押车辆决定书";//北京市交通执法总队扣押车辆决定书
    public static final String STR_LIVETRANSCRIPT = "现场笔录";//北京市交通执法总队现场笔录
    public static final String STR_ADMINISTRATIVE = "行政处罚决定书";//北京市交通执法总队当场行政处罚决定书(警告)
    public static final String STR_CARFORM = "扣押车辆交接单";//北京市交通执法总队执法暂扣车辆交接单
    public static final String STR_ZPDZ = "询问笔录";//北京市交通执法总队现场拍照

    public static final String INSPECTION = "APP-执法稽查";
    public static final String BASIC = "APP-基础信息";
    public static final String ILLEGALINFO = "APP-违法信息";
    public static final String POSITION = "APP-车辆定位";
    public static final String CASECREATE = "APP-案件创建";
    public static final String ASK = "APP-询问笔录";
    public static final String CASELIST = "APP-案件列表";
    public static final String CASEPRINT = "APP-文书打印";
    public static final String WARNING = "APP-稽查预警";
    public static final String DISTRIBUTION = "APP-人车分布";
    public static final String INSPECTIONRECORD = "APP-稽查记录";
    public static final String OTHERS = "APP-其他";
    public static final String VIDEOPLAY = "APP-视频查看";
    public static final String CARDSCAN = "APP-证件扫描";
    public static final String SUPICIOUSVEHICLE = "APP-可疑车辆分布";
    public static final String TRACK = "APP-轨迹查询";
    public static final String MINE = "APP-我的";
    public static final String ONLINEORDER = "APP-网约车订单";
    public static final String INVOICEQUERY = "APP-发票信息";
    public static final String ILLEGALBEIJING = "APP-进出京查询";

    public static final String PERMISSIONING = "权限正在请求中，请稍后...";
    public static final String NO_PERMISSION = "暂无权限使用此功能";
    public static final String PERMISSION_UNBOUND = "当前用户未绑定角色，请联系管理员";

    public static final String D_CHANNEL = "999999";
    public static final String R_CHANNEL = "40010601";

    //文书2.0用到
    public static final String ZLGZTZS = "ZLGZTZS";//北京市交通执法总队责令(限期)改正通知书
    public static final String XCJCBL2 = "XCJCBL2";//北京市交通执法总队现场检查笔录
    public static final String XWBL_HXY1 = "XWBL_HXY1";//北京市交通执法总队询问笔录1(黑巡游)
    public static final String XWBL_HWY1 = "XWBL_HWY1";//北京市交通执法总队询问笔录1(黑网约)
    public static final String XWBL1 = "XWBL1";//北京市交通执法总队询问笔录1
    public static final String XWBL_HXY2 = "XWBL_HXY2";//北京市交通执法总队询问笔录2(黑巡游)
    public static final String XWBL_HXY3 = "XWBL_HXY3";//北京市交通执法总队询问笔录3(黑巡游)
    public static final String XWBL_HWY2 = "XWBL_HWY2";//北京市交通执法总队询问笔录2(黑网约)
    public static final String XWBL_HWY3 = "XWBL_HWY3";//北京市交通执法总队询问笔录3(黑网约)
    public static final String XWBL2 = "XWBL2";//北京市交通执法总队询问笔录2
    public static final String XWBL3 = "XWBL3";//北京市交通执法总队询问笔录3

    public static final String FTPNAME = "snap_ftp";
    public static final String FTPPASSWORD = "snapftp12345678";
}
