package com.huatu.common.spring.cache;

import java.lang.annotation.*;

/**
 * 用来标记方法中会生成缓存
 * @author hanchao
 * @date 2017/10/5 18:19
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Cached {

    /**
     * 缓存的业务名称，如“课程列表”
     * @return
     */
    String value();

    CacheType type() default CacheType.REDIS;

    int cluster() default 1;//所使用的集群，目前只有1个

    String key();//spel表达式，

    enum CacheType{
        REDIS,
        MEMCACHE,
        SSDB,
        LOCAL
    }
}
