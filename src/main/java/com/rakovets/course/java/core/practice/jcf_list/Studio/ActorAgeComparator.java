package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int num = (o1.getAge() > o2.getAge()) ? 1 : -1;
        return num;
    }
}
