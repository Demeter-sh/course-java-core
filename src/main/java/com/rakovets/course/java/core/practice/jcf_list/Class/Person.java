package com.rakovets.course.java.core.practice.jcf_list.Class;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int averageAnnualMark;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public Person(String name, String surname, int age, int averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && averageAnnualMark == person.averageAnnualMark && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, averageAnnualMark);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageAnnualMark=" + averageAnnualMark +
                '}';
    }
}
