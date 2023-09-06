package com.rakovets.course.java.core.practice.jcf_list.SchoolClass;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        var result = (o1.getSurname().compareTo(o2.getSurname()) != 0 ? o1.getSurname().compareTo(o2.getSurname()) : o1.getName().compareTo(o2.getName()));
        return result;
    }
}
