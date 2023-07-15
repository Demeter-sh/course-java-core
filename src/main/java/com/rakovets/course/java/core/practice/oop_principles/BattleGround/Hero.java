package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

abstract public class Hero implements Mortal {
    String name;
    int health;
    Hero(String name, int health) {
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

    public String getName() {
        return name;
    }

    public String attackEnemy(Enemy enemy) {
        return null;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
