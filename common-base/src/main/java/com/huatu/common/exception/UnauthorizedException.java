package com.huatu.common.exception;

import com.huatu.common.CommonErrors;
import com.huatu.common.ErrorResult;

/**
 * @author hanchao
 * @date 2017/8/24 10:05
 */
public class UnauthorizedException extends BizException {
    public UnauthorizedException(String customMessage) {
        super(CommonErrors.PERMISSION_DENIED,customMessage);
    }

    public UnauthorizedException(ErrorResult errorResult){
        super(errorResult);
    }
}
