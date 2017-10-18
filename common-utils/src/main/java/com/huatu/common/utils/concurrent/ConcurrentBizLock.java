package com.huatu.common.utils.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 利用jucmap实现穿透限流
 * @author hanchao
 * @date 2017/10/18 11:22
 */
public class ConcurrentBizLock {
    private static ConcurrentHashMap<Object,Object> locks = new ConcurrentHashMap();
    private static final boolean V = true;

    public static boolean tryLock(Object key){
        Object result = locks.putIfAbsent(key, V);
        return result == null ? true : false;
    }

    public static boolean releaseLock(Object key){
        Object result = locks.remove(key);
        return result == null ? true : false;
    }

}
