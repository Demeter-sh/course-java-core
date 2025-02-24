package com.rakovets.course.java.core.practice.generics;

public class Math <T extends Number> {
    T[] number;

    public Math(T[] number) {
        this.number = number;
    }
}
