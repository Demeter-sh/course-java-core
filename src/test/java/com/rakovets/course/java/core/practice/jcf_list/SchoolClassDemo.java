package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Class.NameSurnameComparator;
import com.rakovets.course.java.core.practice.jcf_list.Class.Person;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        Person dmitryRac = new Person("Dmitry", "Rac", 7, 7);
        Person ivanIvanov = new Person("Ivan", "Ivanov", 8 , 8);
        Person alexBreznev = new Person("Alex", "Areznev", 9, 9);
        Person alexDreznev = new Person("Alex", "Dreznev", 9, 9);
        List<Person> personList = new ArrayList<>(List.of(ivanIvanov, alexDreznev,dmitryRac,  alexBreznev));
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.sort(new NameSurnameComparator());
        System.out.println("After sorting list by name and surname");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
