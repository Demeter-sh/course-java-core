package com.rakovets.course.java.core.practice.oop_principles;

public class Warrior extends Hero {
    String name;

    Warrior(String name, int health) {
        super(name, health);
    }

    public String attackEnemy(Zombie zombie) {
        zombie.takeDamage(10);
        return "Warrior attacks zombie";
    }
}
