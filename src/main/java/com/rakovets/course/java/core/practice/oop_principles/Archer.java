package com.rakovets.course.java.core.practice.oop_principles;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    public String attackEnemy(Zombie zombie) {
        zombie.takeDamage(15);
        return "Archer attacks zombie";
    }
}
