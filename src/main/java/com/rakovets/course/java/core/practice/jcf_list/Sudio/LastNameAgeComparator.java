package com.rakovets.course.java.core.practice.jcf_list.Sudio;

import java.util.Comparator;

public class LastNameAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = (o1.getLastName().compareTo(o2.getLastName()) != 0) ? o1.getLastName().compareTo(o2.getLastName()) : Double.compare(o1.getAge(), o2.getAge());
        return result;
    }
}
