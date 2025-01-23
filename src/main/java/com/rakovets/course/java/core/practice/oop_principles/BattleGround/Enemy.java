package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Enemy implements Mortal {
    private int health;
    private int defaultAttack;

    {
        health = 20;
        defaultAttack = 10;
    }

    public Enemy() {
    }

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health = health - damage;
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(defaultAttack);
    }
}
