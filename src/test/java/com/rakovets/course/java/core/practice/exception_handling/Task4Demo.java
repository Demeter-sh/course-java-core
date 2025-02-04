package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exception.RunTimeExceptionSuccessor;

public class Task4Demo {
    public static void main(String[] args) {
        Task4 t = new Task4("Message for custom runtime exception");
        try {
            t.someMethod(null);
        } catch (RunTimeExceptionSuccessor rtExS) {
            rtExS.printStackTrace();
        }
    }
}
