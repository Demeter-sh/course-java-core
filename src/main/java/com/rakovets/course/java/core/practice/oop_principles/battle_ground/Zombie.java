package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(10);
    }

    public void resurrection() {
        if (!this.isAlive()) {
            this.setHealth(50);
        }
    }
}
