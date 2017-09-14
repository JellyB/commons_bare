package com.huatu.common.utils.reflect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther hanchao
 * @date 2016/12/5 17:05
 */
public class ClassUtils {
    private static final Logger _logger = LoggerFactory.getLogger(ClassUtils.class);
    public static String getClassByteName(Class clazz) {
        String name = clazz.getCanonicalName();
        return getClassByteName(name);
    }

    public static String getClassByteName(String name) {
        return name.replace(".", "/");
    }

    public static String convertType2Signature(String typeName) {
        return getClassByteName(typeName).replace(">", ";>").replace("<", "<L");
    }

    public static String makeBeanName(String name) {
        if(name == null || name.length() == 0){
            return name;
        }else{
            return name.substring(0,1).toLowerCase()+name.substring(1,name.length());
        }
    }

    public static Map<String,Object> getBeanProperties(Object object){
        Map<String,Object> map = new HashMap<String,Object>();
        Class<?> clazz = object.getClass();
        if(clazz.isPrimitive() || clazz.isArray() || clazz.isEnum() || Collection.class.isAssignableFrom(clazz) || CharSequence.class.isAssignableFrom(clazz) || Number.class.isAssignableFrom(clazz)){
            _logger.error("not a bean");
            return map;
        }
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class fieldClass = field.getType();
            if(fieldClass.isPrimitive() || CharSequence.class.isAssignableFrom(fieldClass) || Number.class.isAssignableFrom(fieldClass)){
                String name = field.getName();
                Method method;
                try {
                    if(fieldClass.equals(Boolean.class)){
                        method = clazz.getMethod("is"+name.substring(0,1).toUpperCase()+name.substring(1,name.length()));
                    }else{
                        method = clazz.getMethod("get"+name.substring(0,1).toUpperCase()+name.substring(1,name.length()));
                    }
                    Object value = method.invoke(object);
                    map.put(name,value);
                } catch (Exception e) {
                    _logger.error("cant find get method for {}.{}",clazz,name);
                }
            }
        }
        return map;
    }
}
