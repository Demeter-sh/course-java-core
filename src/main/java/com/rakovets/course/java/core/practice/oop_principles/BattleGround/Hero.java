package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public abstract class Hero implements Mortal{
    private String name;
    private int health;

    {
        name = "Hero";
        health = 20;
    }

    public Hero(){}

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        health = health - damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
