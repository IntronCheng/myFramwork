package com.subin.framework.aop.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ Author: levin
 * @ date: 2018/1/23 下午10:06
 * @ description:
 */
public class ReflectionUtils {

    public static Object invokeMethodUseReflection(Object target, Method method, Object[] args) {
        method.setAccessible(true);
        try {
            return method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
