package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getYear() - o2.getYear();
    }
}
