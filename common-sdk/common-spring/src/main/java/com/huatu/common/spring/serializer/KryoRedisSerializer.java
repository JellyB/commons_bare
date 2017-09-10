package com.huatu.common.spring.serializer;

import com.huatu.common.serialize.kryo.KryoSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @author hanchao
 * @date 2017/9/6 18:39
 */
public class KryoRedisSerializer<T> implements RedisSerializer {
    private KryoSerializer kryoSerializer = new KryoSerializer();
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        return kryoSerializer.serialize(o);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return kryoSerializer.deserialize(bytes);
    }
}
