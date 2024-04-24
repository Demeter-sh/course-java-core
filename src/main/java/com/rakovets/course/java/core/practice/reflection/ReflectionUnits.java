package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class ReflectionUnits {
    private static final Logger logger = Logger.getLogger(ReflectionUnits.class.getName());

    public void getFieldName(Class<?> cls, String name) {
        try {
            Field field = cls.getDeclaredField(name);
            System.out.println(field.getName());
        } catch (NoSuchFieldException ex) {
            logger.warning(ex.getMessage());
        }
    }

    public void  getMethodName(Object object, String name) {
        Class<?> cls = object.getClass();
        try {
            Method method = cls.getDeclaredMethod(name);
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            logger.warning(e.getMessage());
        }
    }

    public void getArrayOfMethod(Object object) {
        Class<?> cls = object.getClass();
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public Method invokeMethod(Method method, Object object) {
        method.setAccessible(true);
        Object o = new Object();
         try {
            method.invoke(o, object);
        } catch (InvocationTargetException | IllegalAccessException ex) {
            logger.warning(ex.getMessage());
        }
         return method;
    }

    public void invokeField(Field field, Object object, Object variable) {
        field.setAccessible(true);
        try {
            field.set(object, variable);
        } catch (IllegalAccessException ex) {
            logger.warning(ex.getMessage());
        }
    }

    public Method returnMethod(Class<?> cls, String methodName, Class<?> ...clsParams) {
        Method method = null;
        try {
            method = cls.getDeclaredMethod(methodName, clsParams);
        } catch (NoSuchMethodException e) {
            logger.warning(e.getMessage());
        }
        return method;
    }

    public void invokeMethod(Method method, Object object, Object ...arguments){
        try {
            method.invoke(object, arguments);
        } catch (InvocationTargetException | IllegalAccessException e) {
            logger.warning(e.getMessage());
        }
    }
}
