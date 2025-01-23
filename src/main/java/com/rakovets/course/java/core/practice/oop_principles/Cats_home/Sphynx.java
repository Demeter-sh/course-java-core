package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

public class Sphynx extends Cat {

    {
        setPercentMew(-7);
        setPercentPurr(7);
    }

    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void purr() {
        System.out.println("pfrrr");
    }

    @Override
    public void mew () {
        System.out.println("mew mew");
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        System.out.println("Sphinx cat meows. Person happiness + 6");
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        System.out.println("Sphinx cat purrs. Person happiness + 6");
    }
}
