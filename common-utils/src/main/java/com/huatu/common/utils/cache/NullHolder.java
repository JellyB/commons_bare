package com.huatu.common.utils.cache;

import java.io.Serializable;

/**
 * @author hanchao
 * @date 2017/9/13 10:40
 */
public class NullHolder implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final NullHolder DEFAULT = new NullHolder();
    private NullHolder(){

    }
}
