package com.rakovets.course.java.core.practice.oop_principles;

public class Zombie extends Enemy{
    Zombie(String name, int health) {
        super(name, health);
    }

    public void resurrect() {
        Zombie zombie = new Zombie(getName(), getHealth());
        if (!zombie.isAlive()) {
            zombie.setHealth(500);
        }
    }

}
