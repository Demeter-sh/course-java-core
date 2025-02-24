package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorUpperAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getAge() - o2.getAge();
    }
}
