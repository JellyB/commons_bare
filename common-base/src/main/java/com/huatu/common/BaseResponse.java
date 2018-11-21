package com.huatu.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhengyi
 * @date 2018/9/11 4:56 PM
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse implements Result {
    private int code;
    private Object message;
    private Object data;

    private BaseResponse(Object data) {
        this.code = SUCCESS_CODE;
        this.data = data;
        this.message = null;
    }

    private BaseResponse(Object data, Object message) {
        this.code = SUCCESS_CODE;
        this.data = data;
        this.message = message;
    }

    public static BaseResponse create(Object message) {
        return new BaseResponse(message);
    }

    public static BaseResponse create(int code, Object message, Object data) {
        return new BaseResponse(code, message, data);
    }

}