package com.huatu.common;


/**
 * 公共错误码表
 * Created by shaojieyue
 * Created time 2016-04-27 21:28
 */
public class CommonErrors {
    public static final ErrorResult INVALID_ARGUMENTS = createImmutableResult(1000101,"非法的参数");
    public static final  ErrorResult SERVICE_INTERNAL_ERROR = createImmutableResult(1000102,"服务内部错误");
    public static final  ErrorResult RESOURCE_NOT_FOUND = createImmutableResult(1000103,"资源未发现");
    public static final  ErrorResult PERMISSION_DENIED = createImmutableResult(1000104,"权限拒绝");
    public static final  ErrorResult FORBIDDEN = createImmutableResult(1000104,"非法请求");

    /**
     * 用户会话过期
     */
    public static final ErrorResult SESSION_EXPIRE = ErrorResult.create(1110002,"用户会话过期");

    /**
     * 用户咋其他设备登录
     */
    public static final ErrorResult LOGIN_ON_OTHER_DEVICE = ErrorResult.create(1110004,"用户在其他设备登录");





    public static ErrorResult createImmutableResult(int code,String message){
        return new ImmutableErrorResult(code,message);
    }
}
