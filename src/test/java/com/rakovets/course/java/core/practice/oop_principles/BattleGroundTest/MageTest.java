package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Mage;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MageTest {
    Mage mage = new Mage("Mage", 100);
    Zombie zombie = new Zombie("Zombie", 100);

    @Test
    void MageAttacksTest() {
        mage.attackEnemy(zombie);
        Assertions.assertEquals(90, zombie.getHealth());
    }
}
