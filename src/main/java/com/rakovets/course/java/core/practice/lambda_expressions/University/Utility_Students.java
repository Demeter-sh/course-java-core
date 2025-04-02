package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility_Students {
    List<Student> studentList;

    public Utility_Students(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void sortStudentsBySpecialty() {
        studentList.stream()
                .sorted(Comparator.comparing(Student::getSpecialty))
                .forEach(System.out::println);
    }

    public void getAmountOfStudentsOnEachSpecialty() {
        Map<String, Integer> mapOfStudents = studentList.stream()
                .collect(HashMap::new, (m, c) -> {
                    m.put(c.getSpecialty(), m.containsKey(c.getSpecialty()) ? (m.get(c.getSpecialty()) + 1) : 1);
                }, HashMap::putAll);

        mapOfStudents.entrySet().forEach(System.out::println);
    }
}
