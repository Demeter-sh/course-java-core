package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

public class Cat {
    private String name;
    private int percentMew;
    private int percentPurr;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPercentMew() {
        return percentMew;
    }

    public void setPercentMew(int percentMew) {
        this.percentMew = percentMew;
    }

    public int getPercentPurr() {
        return percentPurr;
    }

    public void setPercentPurr(int percentPurr) {
        this.percentPurr = percentPurr;
    }

    {
        percentMew = -5;
        percentPurr = 5;
    }

    public Cat (String name) {
        this.name = name;
    }

    public void mew() {
        System.out.println("mew");
    }

    public void mew(Person person) {
        person.changeHappiness(percentMew);
    }

    public void purr() {
        System.out.println("purr");
    }

    public void purr(Person person) {
        person.changeHappiness(percentPurr);
    }
}
