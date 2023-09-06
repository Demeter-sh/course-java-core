package com.rakovets.course.java.core.practice.jcf_list.SchoolClass;

import com.rakovets.course.java.core.example.generics.model.restrict.D;

import java.util.Comparator;

public class AverageAnualMarkComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
    }
}
