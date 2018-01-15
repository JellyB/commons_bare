package com.huatu.tiku.common.bean.report;

/**
 * @author hanchao
 * @date 2018/1/11 15:02
 */
public abstract class AbstractReportMessage implements ReportMessage {
    private long timestamp;//时间戳，上报时间

    @Override
    public long getTimestamp() {
        return timestamp;
    }
}
