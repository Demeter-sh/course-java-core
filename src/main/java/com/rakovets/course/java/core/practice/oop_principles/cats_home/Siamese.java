package com.rakovets.course.java.core.practice.oop_principles.cats_home;

public class Siamese extends Cat{
    public Siamese(String name) {
        super(name);
    }

    @Override
    public String mew() {
        return "Мew";
    }

    @Override
    public void mew(Person person) {
        person.changeHappiness(+5);
    }

    @Override
    public String purr() {
        return "Prrrr";
    }

    @Override
    public void purr(Person person) {
        person.changeHappiness(+15);
    }
}
