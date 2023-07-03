package com.rakovets.course.java.core.practice.oop_principles;

public class Mage extends Hero {
    public Mage(String name, int heath) {
        super(name, heath);
    }

    public String attackEnemy(Zombie zombie) {
        if (zombie.isAlive())
            zombie.takeDamage(10);
        return "Mage attacks zombie";
    }
}
