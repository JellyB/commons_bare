package com.huatu.tiku.common.bean.report;

import lombok.Data;

/**
 * TODO 异常监控
 * @author hanchao
 * @date 2018/1/11 15:00
 */
@Data
public class ExceptionReportMessage extends AbstractReportMessage {
    private String exception;
    private String message;
    private String stacktrace;

    @Override
    public ReportType type() {
        return ReportType.EXCEPTION;
    }
}
