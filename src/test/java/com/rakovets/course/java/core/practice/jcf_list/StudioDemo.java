package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Sudio.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class StudioDemo {
    public static void main(String[] args) {
        Actor Johny = new Actor("Johnny", "Depp", 1000000, 59);
        Actor JohnyJ = new Actor("Johnny", "Depp", 1000000, 49);
        Actor Leonardo = new Actor("Leonardo", "DiCaprio", 1500000, 47);
        Actor Charles = new Actor("Charles", "Hunnam", 900000, 42);
        Actor Jensen = new Actor("Jensen", "Ackles", 800000, 44);
        List<Actor> actorArrayList = new ArrayList<>(List.of(Johny, Leonardo, Charles, Jensen));


        actorArrayList.sort(new LastNameComparator());
        ListIterator listIterator0 = actorArrayList.listIterator();
        System.out.println("Sort by last name");
        while(listIterator0.hasNext()) {
            System.out.println(listIterator0.next());
        }

        actorArrayList.sort(new AgeComparator());
        ListIterator<Actor> listIterator1 = actorArrayList.listIterator();
        System.out.println("Sort by age");
        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        actorArrayList.add(JohnyJ);
        actorArrayList.sort(new LastNameAgeComparator());
        ListIterator<Actor> actorListIterator = actorArrayList.listIterator();
        System.out.println("Sort by lastName and age");
        while (actorListIterator.hasNext()) {
            System.out.println(actorListIterator.next());
        }

        actorArrayList.remove(JohnyJ);
        actorArrayList.sort(new FeeLastNameComparator());
        ListIterator<Actor> actorListIterator1 = actorArrayList.listIterator();
        System.out.println("Sort by fee and last age");
        while (actorListIterator1.hasNext()) {
            System.out.println(actorListIterator1.next());
        }


        Studio studio = new Studio();
        studio.fire(actorArrayList);
        ListIterator<Actor> actorListIterator2 = studio.getActors().listIterator();
        System.out.println("Fire demo");
        while (actorListIterator2.hasNext()) {
            System.out.println(actorListIterator2.next());
        }

    }
}
