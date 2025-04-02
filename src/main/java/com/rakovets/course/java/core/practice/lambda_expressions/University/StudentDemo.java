package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Dmitry", "Asdf", "philology", 3);
        Student s2 = new Student("Alexander", "Las", "physics", 3);
        Student s3 = new Student("Max", "Nsa", "math", 4);
        Student s4 = new Student("Elena", "Asdf","philology", 2);
        Student s5 = new Student("Mary", "Rz", "physics", 3);
        List<Student> studentList = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
        Utility_Students utility_students = new Utility_Students(studentList);

        //группировка студентов по курсу
        System.out.println("\nsortStudentsBySpecialty()");
        utility_students.sortStudentsBySpecialty();

        //получение количество учащихся на каждой из специальностей
        System.out.println("\ngetAmountOfStudentsOnEachSpecialty");
        utility_students.getAmountOfStudentsOnEachSpecialty();
    }
}
