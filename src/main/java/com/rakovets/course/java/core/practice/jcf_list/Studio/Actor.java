package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Objects;

public class Actor implements Comparable <Actor>{
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getFee() {
        return fee;
    }

    public Actor(String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public int compareTo(Actor o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fee=" + fee +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return fee == actor.fee && age == actor.age && Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, fee, age);
    }
}
