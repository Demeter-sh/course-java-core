package com.rakovets.course.java.core.practice.oop_principles;

public abstract class Enemy implements Mortal {
    int health;
    Enemy(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        boolean alive = false;
        if (health >= 0) {
            alive = true;
        }
        return alive;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void takeDamage(int damage);
}
