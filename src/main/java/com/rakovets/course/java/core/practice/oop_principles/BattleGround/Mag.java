package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Mag extends Hero {

    private int defaultAttack;
    private int health;

    {
        defaultAttack = 8;
    }

    public Mag() {
        super();
    }

    public Mag(String name) {
        super(name);
    }

    public Mag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(defaultAttack);
        System.out.println("Mag attacks enemy");
    }

    @Override
    public void takeDamage(int enemyAttack) {
        health = health - enemyAttack;
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}
