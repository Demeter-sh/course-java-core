package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Archer extends Hero {

    private int defaultAttack;
    private int health;

    {
        defaultAttack = 9;
    }

    public Archer() {
        super();
    }

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int heath) {
        super(name, heath);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(defaultAttack);
        System.out.println("Archer attacks enemy");
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
