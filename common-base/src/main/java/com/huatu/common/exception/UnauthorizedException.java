package com.huatu.common.exception;

import com.huatu.common.CommonResult;
import com.huatu.common.ErrorResult;

/**
 * @author hanchao
 * @date 2017/8/24 10:05
 */
public class UnauthorizedException extends BizException {
    public UnauthorizedException(){
        super(CommonResult.PERMISSION_DENIED);
    }
    public UnauthorizedException(String customMessage) {
        super(CommonResult.PERMISSION_DENIED,customMessage);
    }

    public UnauthorizedException(ErrorResult errorResult){
        super(errorResult);
    }

    public UnauthorizedException(ErrorResult errorResult,String customMessage) {
        super(errorResult,customMessage);
    }
}
