package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Objects;

public class Actor{
    private String firstName;
    private String lastName;
    private int fee;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getFee() {
        return fee;
    }

    public int getAge() {
        return age;
    }

    public Actor (String firstName, String lastName, int fee, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor {" +
                "first name: " + firstName
                + " last name: " + lastName
                +  " fee: " + fee
                +  " age: " + age
                + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Actor actor = (Actor) obj;
        return firstName.equals(actor.firstName) && lastName.equals(actor.lastName)
                && Objects.equals(fee, actor.fee) && Objects.equals(age, actor.age);
    }
}
