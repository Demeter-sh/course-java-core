package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorCompareLastNameAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = 0;
        if (o1.getLastName().compareTo(o2.getLastName()) > 0) {
            result = 1;
        } if(o1.getLastName().compareTo(o2.getLastName()) < 0) {
            result = -1;
        } if (o1.getLastName().compareTo(o2.getLastName()) == 0 && o1.getAge() - o2.getAge() > 0) {
            result = 1;
        }
        return result;
    }
}
