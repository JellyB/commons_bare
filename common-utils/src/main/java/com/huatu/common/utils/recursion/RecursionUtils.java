package com.huatu.common.utils.recursion;

import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;

/**
 * @author hanchao
 * @date 2017/10/6 11:15
 */
public class RecursionUtils {
    /**
     * 递归将数据放入collection
     * @param func
     * @param <T>
     * @return
     */
    public static <T> void recursion(T t,RecursionFunc<T> func){
        Collection<T> recursion = func.recursion(t);
        if(CollectionUtils.isNotEmpty(recursion)){
            for (T tmp : recursion) {
                recursion(tmp,func);
            }
        }
    }


    /**
     * 递归的出口是返回了空的集合
     * @param <T>
     */
    public interface RecursionFunc<T>{
        Collection<T> recursion(T t);
    }



}
