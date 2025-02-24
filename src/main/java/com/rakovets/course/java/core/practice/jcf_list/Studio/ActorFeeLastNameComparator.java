package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorFeeLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = 0;
        if(o1.getFee() - o2.getFee() > 1) {
            result = 1;
        } if (o1.getFee() - o2.getFee() < 1) {
            result = -1;
        } if(o1.getFee() - o2.getFee() ==0 && o1.getLastName().compareTo(o2.getLastName()) > 0) {
            result = 1;
        }
        return result;
    }
}
