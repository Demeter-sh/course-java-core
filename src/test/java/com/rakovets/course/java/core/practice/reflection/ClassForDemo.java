package com.rakovets.course.java.core.practice.reflection;

public class ClassForDemo {
    private int intField;

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    void getAnotherMethod1() {}

    protected String getAnotherMethod2() {
        return "";
    }

    public int getAnotherMethod3(int a) {
        return a;
    }


}
