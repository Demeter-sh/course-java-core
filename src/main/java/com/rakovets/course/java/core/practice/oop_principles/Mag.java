package com.rakovets.course.java.core.practice.oop_principles;

public class Mag extends Hero {
    String name;
    Mag(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(15);
        return "Archer attacks enemy";
    }
}
