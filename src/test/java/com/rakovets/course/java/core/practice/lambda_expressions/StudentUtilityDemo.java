package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.University.Student;
import com.rakovets.course.java.core.practice.lambda_expressions.University.StudentUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class StudentUtilityDemo {
    public static void main(String[] args) {
        //Лист студентов
        List<Student> studentListDemo = new ArrayList<>(List.of(new Student("Student1","One","chemistry",1),
                new Student("Student2", "Two", "physics", 2),
                new Student("Student3", "Three", "chemistry", 2),
                new Student("Student4", "Four", "physics", 1),
                new Student("Student5", "Five", "chemistry", 2),
                new Student("Student6", "Six", "philology", 3)));
        StudentUtility studentUtility = new StudentUtility();
        //Демо метода getSortedStudentListByYear
        List<Student> studentListByYear = studentUtility.getSortedByYearStudentList(studentListDemo);
        ListIterator<Student> studentListIterator = studentListByYear.listIterator();
        System.out.println("группировка студентов по курсу");
        while (studentListIterator.hasNext()) {
            System.out.println(studentListIterator.next());
        }
        //Демо метода getStudentListByCourse
        List<Student> studentListByCourse = studentUtility.getStudentByCourseList(studentListDemo);
        ListIterator<Student> studentListIteratorByCourse = studentListByCourse.listIterator();
        System.out.println("получение списка специальностей (в алфавитном порядке), на которых учатся студенты");
        while (studentListIteratorByCourse.hasNext()) {
            System.out.println(studentListIteratorByCourse.next());
        }
        //Демо метода getNumberOfStudentsOnCourseMap
        Map<String, Long> studentsByCourseMap = studentUtility.getNumberOfStudentsOnCourseMap(studentListDemo);
        System.out.println("получение количество учащихся на каждой из специальностей");
        System.out.println(studentsByCourseMap);
        //Демо метода groupStudentsBySpecialityAndYear
        List<Student> studentsByCourseAndYearList = studentUtility.groupStudentsBySpecialityAndYear(studentListDemo);
        System.out.println("групировка студентов по специальностям (сохраняя алфавитный порядок специальности), а затем группировки по курсу");
        ListIterator<Student> studentsByCourseAndYearListIterator = studentsByCourseAndYearList.listIterator();
        while (studentsByCourseAndYearListIterator.hasNext()) {
            System.out.println(studentsByCourseAndYearListIterator.next());
        }
        //Демо метода studentListContainsCourse
        boolean b = studentUtility.studentListContainsCourse(studentListDemo, "chemistr");
        System.out.println("проверка, есть ли среди учащихся кокретного курса, за исключение списка каких-то специальностей");
        System.out.println(b);
    }
}
