package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Hero;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Zombie;

public class Mage extends Hero {
    public Mage(String name, int heath) {
        super(name, heath);
    }

    public String attackEnemy(Zombie zombie) {
        if (zombie.isAlive())
            zombie.takeDamage(10);
        return "Mage attacks zombie";
    }
}
