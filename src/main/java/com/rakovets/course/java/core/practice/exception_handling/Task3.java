package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exception.CustomExceptionForTask3;

public class Task3 {
    public void methodThrowsException(int n) throws CustomExceptionForTask3 {
        if (n != 0) {
            throw new CustomExceptionForTask3("The number is not 0");
        }
    }
}
