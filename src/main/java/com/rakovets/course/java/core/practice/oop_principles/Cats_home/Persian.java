package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

public class Persian extends Cat {

    {
        setPercentMew(-4);
        setPercentPurr(4);
    }

    public Persian(String name) {
        super(name);
    }

    @Override
    public void purr() {
        System.out.println("pffrrr");
    }

    @Override
    public void mew () {
        System.out.println("meaw meaw");
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        System.out.println("Persian cat meows. Person happiness " + getPercentMew());
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        System.out.println("Persian cat purrs. Person happiness + 4");
    }
}
