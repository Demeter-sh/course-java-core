package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exception.CustomExceptionForTask3;

public class Task3Demo {
    public static void main(String[] args) {
        Task3 t3 = new Task3();
        try {
            t3.methodThrowsException(1);
        } catch (CustomExceptionForTask3 e) {
            e.printStackTrace();
        }
    }
}
