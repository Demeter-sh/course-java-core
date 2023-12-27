package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentUtility {
    public List<Student> getSortedByYearStudentList(List<Student> studentList) {
        return studentList.stream()
                .sorted(new ComparatorByYear())
                .collect(Collectors.toList());
    }

    public List<Student> getStudentByCourseList(List<Student> studentList) {
        return studentList.stream()
                .sorted(new SpecialityComparator())
                .collect(Collectors.toList());
    }

    public Map<String, Long> getNumberOfStudentsOnCourseMap(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getSpecialty, Collectors.counting()));
    }

    public List<Student> groupStudentsBySpecialityAndYear(List<Student> studentList) {
        return studentList.stream()
                .sorted(new SpecialityComparator())
                .sorted(new ComparatorByYear())
                .collect(Collectors.toList());
    }

    public boolean studentListContainsCourse(List<Student> studentList, String speciality) {
        return studentList.stream()
                .anyMatch(s -> s.getSpecialty().equals(speciality));
    }
}
