package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.University.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtilityTest {
    List<Student> studentList = new ArrayList<>(List.of(new Student("Student1","One","philology",1),
                                                        new Student("Student2", "Two", "physics", 1),
                                                        new Student("Student3", "Three", "chemistry", 1),
                                                        new Student("Student4", "Four", "physics", 2),
                                                        new Student("Student5", "Five", "chemistry", 2),
                                                        new Student("Student6", "Six", "philology", 2)));

}
