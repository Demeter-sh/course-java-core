package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Studio {

    public void fire(List<Actor> actorsList) {
        actorsList.sort(new ActorFeeComparator());
        actorsList.remove(actorsList.size() - 1);
    }

    public static void main(String[] args) {
        List<Actor> actorList = new ArrayList<>(List.of(new Actor("James", "Bond", 20, 20),
                                                        new Actor("Johny", "Depp", 15, 22),
                                                        new Actor("Jacky", "Chan", 10, 19),
                                                        new Actor("Jason", "Statham",25,19)));
        Studio studio = new Studio();
        actorList.sort(new ActorAgeComparator());
        ListIterator<Actor> actorListIterator = actorList.listIterator();
        while (actorListIterator.hasNext()) {
            System.out.println(actorListIterator.next());
        }
    }
}
