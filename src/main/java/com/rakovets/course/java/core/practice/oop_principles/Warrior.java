package com.rakovets.course.java.core.practice.oop_principles;

public class Warrior extends Hero {
    String name;

    Warrior(String name) {
        super(name);
    }

    public String attackEnemy(Enemy enemy) {
        enemy.takeDamage(10);
        return "Warrior attacks enemy";
    }
}
