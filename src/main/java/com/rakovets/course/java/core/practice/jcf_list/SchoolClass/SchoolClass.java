package com.rakovets.course.java.core.practice.jcf_list.SchoolClass;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public List<Person> getStudents() {
        return students;
    }

    public List<Person> getBestStudent(List<Person> personList) {
        personList.sort(new AverageAnualMarkComparator());
        students = new ArrayList<>(personList);
        return students;
    }
}
