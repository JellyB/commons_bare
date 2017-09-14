package com.huatu.common.utils.proxy;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author hanchao
 * @date 2017/9/12 22:15
 */
public class AsmInterFaceHandler implements InterfaceHandler {
    private AtomicBoolean _lock = new AtomicBoolean(true);
    public static final String PROXY_SUFFIX = "AutoProxy";
    @Override
    public Class<?> generateClass(Class<?> inter,Map<Class,String> resultMapping) throws Exception{
        String name = inter.getSimpleName();
        return null;
    }
}
