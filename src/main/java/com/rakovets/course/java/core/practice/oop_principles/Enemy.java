package com.rakovets.course.java.core.practice.oop_principles;

public class Enemy implements Mortal {
    private int health;
    private String name;
    Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        boolean alive = true;
        if (health == 0) {
            alive = false;
        }
        return alive;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String attackHero(Hero hero) {
        return "Enemy attacks Hero";
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
