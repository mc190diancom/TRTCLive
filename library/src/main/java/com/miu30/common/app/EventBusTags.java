package com.miu30.common.app;

import org.simple.eventbus.EventBus;

/**
 * ================================================
 * 放置 {@link EventBus} 的 Tag, 便于检索
 *
 * @see <a href="https://github.com/JessYanCoding/MVPArms/wiki#3.5">EventBusTags wiki 官方文档</a>
 * Created by MVPArmsTemplate
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public interface EventBusTags {
    //下载地图
    int DOWNLOAD_MAP = 300;

    //稽查网约车使用Tag的范围规定为 1000 ~ 2000
    String QUERY_ORDER_TYPE = "1000";
}
