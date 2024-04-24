package com.rakovets.course.java.core.practice.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUnitsDemo {
    public static void main(String[] args) throws Exception {
        ClassForDemo classForDemo = new ClassForDemo();
        ReflectionUnits reflectionUnits = new ReflectionUnits();
        Class<?> cls = classForDemo.getClass();
        System.out.println("field name:");
        reflectionUnits.getFieldName(classForDemo.getClass(), "intField");

        System.out.println("method name:");
        reflectionUnits.getMethodName(classForDemo, "getAnotherMethod1");

        System.out.println("methods names:");
        reflectionUnits.getArrayOfMethod(classForDemo);

        Field field = classForDemo.getClass().getDeclaredField("intField");
        reflectionUnits.invokeField(field, classForDemo, 7);
        System.out.println(classForDemo.getIntField());

        System.out.println("return method");
        Method method1 = reflectionUnits.returnMethod(cls, "setIntField", int.class);
        method1.invoke(classForDemo, 1);
        System.out.println(classForDemo.getIntField());

        System.out.println("invokeMethod");
        reflectionUnits.invokeMethod(method1, classForDemo, 2);
        System.out.println(classForDemo.getIntField());
    }
}
