package com.rakovets.course.java.core.practice.oop_principles;

class Siamese extends Cat {

    public Siamese(String name) {
        super(name);
    }

    public String mew() {
        return "mew";
    }

    public String mew(Person person) {
        person.changeHappiness(-8);
        return "mew";
    }

    public String purr() {
        return "frrr";
    }

    public String purr(Person person) {
        person.changeHappiness(8);
        return "frrr";
    }
}
