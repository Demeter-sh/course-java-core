package com.rakovets.course.java.core.practice.jcf_list.Sudio;

import java.util.Objects;

public class Actor {
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Actor{"
           + "first name = " + getFirstName()
           + "last name = " + getLastName()
           + ", age = " + getAge()
           + ", fee = " + getFee() +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Actor act = (Actor) o;
        return fee == act.fee && age == act.age && Objects.equals(firstName, act.firstName) && Objects.equals(lastName, act.lastName);
    }
}
