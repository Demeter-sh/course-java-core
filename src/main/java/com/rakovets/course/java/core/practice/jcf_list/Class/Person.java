package com.rakovets.course.java.core.practice.jcf_list.Class;

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
    public String toString() {
        return "Student{ name: " + name
                + " surname: " + surname
                + " age: " + age
                + " average annual mark: " + averageAnnualMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
        return true;
        if(this.getClass() != o.getClass()) {
            return false;
        }
        Person p = (Person) o;
        return name.equals(p.name) && surname.equals(p.surname) && age == p.age && averageAnnualMark == p.getAverageAnnualMark();
    }
}
