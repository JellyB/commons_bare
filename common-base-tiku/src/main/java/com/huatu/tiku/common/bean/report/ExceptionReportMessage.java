package com.huatu.tiku.common.bean.report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO 异常监控
 * @author hanchao
 * @date 2018/1/11 15:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionReportMessage extends ReportMessage {
    private String exception;
    private String message;
    private String stacktrace;

}
