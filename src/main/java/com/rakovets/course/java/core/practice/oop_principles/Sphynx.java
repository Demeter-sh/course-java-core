package com.rakovets.course.java.core.practice.oop_principles;

public class Sphynx extends Cat {

    public Sphynx(String name) {
        super(name);
    }

    public String mew() {
        return "niaw";
    }

    public String mew(Person person) {
        person.changeHappiness(-9);
        return "niaw";
    }

    public String purr() {
        return "mrrr";
    }

    public String purr(Person person) {
        person.changeHappiness(9);
        return "mrrr";
    }
}
