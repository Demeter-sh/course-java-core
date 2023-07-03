package com.rakovets.course.java.core.practice.oop_principles;

public class Mag extends Hero {
    Mag(String name, int heath) {
        super(name, heath);
    }

    public String attackEnemy(Zombie zombie) {
        if (zombie.isAlive()) {
            zombie.takeDamage(10);
            return "Mage attacks zombie";
        } else
            zombie.setHealth(0);
            return "Zombie is dead";
    }
}
