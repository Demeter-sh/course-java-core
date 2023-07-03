package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.Archer;
import com.rakovets.course.java.core.practice.oop_principles.Mage;
import com.rakovets.course.java.core.practice.oop_principles.Warrior;
import com.rakovets.course.java.core.practice.oop_principles.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {
    Mage mag = new Mage("Mage", 100);
    Archer archer = new Archer("Archer", 100);
    Zombie zombie = new Zombie("Zombie", 100);
    Warrior warrior = new Warrior("Warrior", 100);

    @Test
    void zombieAttacksMageTest() {
        zombie.attackHero(mag);
        Assertions.assertEquals(80, mag.getHealth());
    }

    @Test
    void zombieAttacksArcherTest() {
        zombie.attackHero(archer);
        Assertions.assertEquals(85, archer.getHealth());
    }
    @Test
    void zombieAttacksWarrior() {
        zombie.attackHero(warrior);
        Assertions.assertEquals(90, warrior.getHealth());
    }
}
