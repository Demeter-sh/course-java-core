package com.rakovets.course.java.core.practice.concurrency;

public class Pr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        String s ="line ";
        for (int i : a) {
            s = s + i * i + "\n";
        }
        System.out.println(s);
    }
}
