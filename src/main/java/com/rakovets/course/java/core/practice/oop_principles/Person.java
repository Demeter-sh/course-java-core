package com.rakovets.course.java.core.practice.oop_principles;

public class Person {
    private int happiness;
    Person(int happiness) {
        this.happiness = happiness;
    }

    public void changeHappiness(int changeHappiness) {
        happiness += changeHappiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
