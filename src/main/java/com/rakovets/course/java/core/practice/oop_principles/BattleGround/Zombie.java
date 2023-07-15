package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

public class Zombie extends Enemy {
    public Zombie(String name, int health) {
        super(name, health);
    }

    public void resurrect() {
        Zombie zombie = new Zombie(getName(), getHealth());
        if (!zombie.isAlive()) {
            zombie.setHealth(500);
        }
    }

    public String attackHero(Mage mage) {
        mage.takeDamage(20);
        return "Zombie attacks mage";
    }

    public String attackHero(Archer archer) {
        archer.takeDamage(15);
        return "Zombie attacks archer";
    }

    public String attackHero(Warrior warrior) {
        warrior.takeDamage(10);
        return "Zombie attacks warrior";
    }
}
