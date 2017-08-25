package com.huatu.common.exception;


import com.huatu.common.CommonErrors;

/**
 * @author hanchao
 * @date 2017/8/24 10:01
 */
public class ArgsValidException extends BizException {
    public ArgsValidException(String customMessage) {
        super(CommonErrors.INVALID_ARGUMENTS,customMessage);
    }
}
