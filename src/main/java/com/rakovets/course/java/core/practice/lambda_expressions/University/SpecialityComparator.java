package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.Comparator;

public class SpecialityComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSpecialty().toUpperCase().compareTo(o2.getSpecialty().toUpperCase());
    }
}
