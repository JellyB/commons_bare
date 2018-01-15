package com.huatu.tiku.common.bean.report;

import com.huatu.tiku.common.bean.user.UserSession;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author hanchao
 * @date 2018/1/11 11:57
 */
@Data
@Builder
public class WebReportMessage extends AbstractReportMessage {
    private String name;
    private String url;
    private String urlParameters;
    private String method;
    private String body;
    private int status;
    private Map<String,List<String>> requestHeaders;
    private Map<String,List<String>> responseHeaders;
    private UserSession userSession;
    private String stacktrace;//出现异常才有
    private Object extraData;
    @Override
    public ReportType type() {
        return ReportType.WEB;
    }
}
