package com.rakovets.course.java.core.practice.exception_handling;

public class Task2Demo {
    public static void main(String[] args) {
        try {
            Task2 task = new Task2();
            task.getArrayIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
