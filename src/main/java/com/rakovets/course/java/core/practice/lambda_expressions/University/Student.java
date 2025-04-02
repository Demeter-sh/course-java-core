package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.Objects;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(specialty, student.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, specialty, year);
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
