package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = 0;
        result = (o1.getLastName().compareTo(o2.getLastName()) != 0 ? o1.getLastName().compareTo(o2.getLastName())
                 : Double.compare(o1.getAge(), o2.getAge()));
        return result;
    }
}
