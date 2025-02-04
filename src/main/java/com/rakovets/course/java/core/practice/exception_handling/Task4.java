package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exception.RunTimeExceptionSuccessor;

public class Task4 {
    private String message;

    public Task4(String message) {
        this.message = message;
    }

    public void someMethod(String str1) throws RunTimeExceptionSuccessor {
        if (str1 == null) {
            throw new RunTimeExceptionSuccessor(message);
        }
    }
}
