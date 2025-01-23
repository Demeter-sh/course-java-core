package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

import java.util.Objects;

public class Person {
    private int happiness;

    {
        happiness = 10;
    }

    public Person() {}

    public Person(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return happiness == person.happiness;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(happiness);
    }

    public void changeHappiness(int percentHappiness) {
        if (percentHappiness > 0) {
            happiness = happiness + percentHappiness;
        } else {
            happiness = happiness + percentHappiness;
        }
    }
}
