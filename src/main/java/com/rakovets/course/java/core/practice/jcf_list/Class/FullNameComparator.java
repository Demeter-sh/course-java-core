package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getSurname().compareTo(o2.getSurname() ) == 0 ? o1.getName().compareTo(o2.getName()) : o1.getSurname().compareTo(o2.getSurname()));
    }
}
