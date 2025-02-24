package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.Comparator;

public class NameSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        if (o1.getName().compareTo(o2.getName()) > 0) {
            result = 1;
        } if (o1.getName().compareTo(o2.getName()) < 0) {
            result = -1;
        } if (o1.getName().compareTo(o2.getName()) == 0 && o1.getSurname().compareTo(o2.getSurname()) > 0) {
            result = 1;
        }
        return result;
    }
}
