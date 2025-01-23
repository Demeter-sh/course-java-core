package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Warrior extends Hero {
    private int defaultAttack;
    private int health;

    {
        defaultAttack = 7;
    }

    public Warrior() {
        super();
    }

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name,int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(defaultAttack);
        System.out.println("Warrior attacks enemy");
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
