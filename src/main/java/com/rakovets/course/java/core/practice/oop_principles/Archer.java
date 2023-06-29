package com.rakovets.course.java.core.practice.oop_principles;

public class Archer extends Hero{
    String name;
    Archer(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        return "Archer attacks enemy";
    }
}
