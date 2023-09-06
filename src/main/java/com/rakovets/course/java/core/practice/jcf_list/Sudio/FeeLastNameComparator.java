package com.rakovets.course.java.core.practice.jcf_list.Sudio;

import java.util.Comparator;

public class FeeLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = (Double.compare(o1.getFee(), o2.getFee()) != 0)? Double.compare(o1.getFee(), o2.getFee()) : o1.getLastName().compareTo(o2.getLastName());
        return result;
    }
}
