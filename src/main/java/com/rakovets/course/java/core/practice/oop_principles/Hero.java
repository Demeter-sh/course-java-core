package com.rakovets.course.java.core.practice.oop_principles;

abstract public class Hero {
    String name;
    int health;

    {
        name = "Undefined";
        health = 100;
    }
    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String attackEnemy(Enemy enemy);
}
