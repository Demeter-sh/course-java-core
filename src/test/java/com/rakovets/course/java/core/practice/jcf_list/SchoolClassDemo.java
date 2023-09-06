package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.FullNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SchoolClassDemo {
    public static void main(String[] args) {
        Person person0 = new Person("John", "Samith", 7, 5);
        Person person1 = new Person("Dmitry", "Sharshukov", 9, 9);
        Person person2 = new Person("Alexandr", "Belov", 12, 8);
        Person person3 = new Person("Sergey", "List", 15, 6);
        List<Person> personList = new ArrayList<Person>(List.of(person0, person1, person2, person3));
        personList.sort(new FullNameComparator());
        ListIterator personListIterator0 = personList.listIterator();
        System.out.println("Full name comparator");

        while (personListIterator0.hasNext()) {
            System.out.println(personListIterator0.next());
        }
        personList.sort(new AgeComparator());
        personListIterator0 = personList.listIterator();
        System.out.println("Age comparator");

        while (personListIterator0.hasNext()) {
            System.out.println(personListIterator0.next());
        }
    }
}
