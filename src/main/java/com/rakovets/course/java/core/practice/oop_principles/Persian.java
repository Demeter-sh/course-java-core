package com.rakovets.course.java.core.practice.oop_principles;

public class Persian extends Cat {

    public Persian(String name) {
        super(name);
    }

    public String mew() {
        return "mewf";
    }

    public String mew(Person person) {
        person.changeHappiness(-6);
        return "mewf";
    }
    public String purr() {
        return "ffrr";
    }

    public String purr(Person person) {
        person.changeHappiness(6);
        return "ffrr";
    }
}
