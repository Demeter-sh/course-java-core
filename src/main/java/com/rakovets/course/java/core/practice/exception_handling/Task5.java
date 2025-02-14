package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exception.Task5Exception;

public class Task5 {
    public void someMethod(int number) {
        try {
            if(number == 0) {
                throw new Task5Exception("number equals 0");
            }
        } catch (Task5Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
