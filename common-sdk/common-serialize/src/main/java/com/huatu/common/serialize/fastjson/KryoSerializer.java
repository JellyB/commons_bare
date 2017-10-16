package com.huatu.common.serialize.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.huatu.common.serialize.Serializations;
import com.huatu.common.serialize.Serializer;

/**
 * 需要定义安全类，redis中替代者为genericjackson2json
 * @author hanchao
 * @date 2017/10/15 0:32
 */
public class KryoSerializer implements Serializer {
    @Override
    public byte[] serialize(Object o) {
        if(o == null){
            return Serializations.EMPTY_ARRAY;
        }
        return JSON.toJSONBytes(o, SerializerFeature.WriteClassName);
    }

    @Override
    public Object deserialize(byte[] bytes) {
        if(Serializations.isEmpty(bytes)){
            return null;
        }
        return JSON.parse(bytes);
    }
}
