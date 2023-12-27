package com.rakovets.course.java.core.practice.lambda_expressions.University;

public class Student {
    private String name;
    private String surname;
   private String specialty;
    private int year;

    public Student(String name, String surname, String specialty, int year) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", year=" + year +
                '}';
    }
}
