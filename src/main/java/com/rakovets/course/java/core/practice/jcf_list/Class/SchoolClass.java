package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent() {
        students.sort(new PersonAverageComparator());
        return students.get(students.size() - 1);
    }
}
