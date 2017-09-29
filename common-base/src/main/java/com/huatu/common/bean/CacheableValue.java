package com.huatu.common.bean;

import lombok.Data;

/**
 * @author hanchao
 * @date 2017/9/29 15:15
 */
@Data
public class CacheableValue extends BaseValue {

    private boolean _cache;
    private long _timestamp;
}
