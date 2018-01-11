package com.huatu.tiku.common.bean.report;

import lombok.Data;

/**
 * @author hanchao
 * @date 2018/1/11 11:57
 */
@Data
public class WebReportMessage implements ReportMessage {
    private String url;
    @Override
    public ReportType type() {
        return ReportType.WEB;
    }
}
