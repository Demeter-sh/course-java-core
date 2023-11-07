package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int num = 0;
        num = (Double.compare(o1.getFee(), o2.getFee()) != 0 ? Double.compare(o1.getFee(), o2.getFee())
               : o1.getLastName().compareTo(o2.getLastName()));
        return num;
    }
}
