package com.rakovets.course.java.core.practice.oop_principles.Cats_home;

public class Siamese extends Cat {

    {
        setPercentMew(-6);
        setPercentPurr(6);
    }

    public Siamese(String name) {
        super(name);
    }

    @Override
    public void purr() {
        System.out.println("prrr");
    }

    @Override
    public void mew () {
        System.out.println("mew mew");
    }

    @Override
    public void mew(Person person) {
        super.mew(person);
        System.out.println("Siamese cat meows. Person happiness + 6");
    }

    @Override
    public void purr(Person person) {
        super.purr(person);
        System.out.println("Siamese cat purrs. Person happiness + 6");
    }
}
