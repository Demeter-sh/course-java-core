package com.rakovets.course.java.core.practice.exception_handling;

public class Task1Demo {
    public static void main(String[] args) {
        try {
            Task1 t1 = new Task1();
            t1.getNullString();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
