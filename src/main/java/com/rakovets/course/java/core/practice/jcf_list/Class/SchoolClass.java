package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    List<Person> students = new ArrayList<>();

    public Person getBestStudent(List<Person> students) {
        students.sort(new StudentsMarkComparator());
        int num = students.size() - 1;
        return students.get(num);
    }

    public static void main(String[] args) {
        List<Person> students = new ArrayList<>(List.of(new Person("Dmitry", "Sarshukov", 29, 7),
                                new Person("Alexandr", "Lex", 20, 9),
                                new Person("Peter", "Parker", 25, 8)));
        SchoolClass schoolClass = new SchoolClass();
        System.out.println(schoolClass.getBestStudent(students));
    }
}
