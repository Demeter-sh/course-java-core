package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Warrior;
import com.rakovets.course.java.core.practice.oop_principles.BattleGround.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    Warrior warrior = new Warrior("Warrior", 100);
    Zombie zombie = new Zombie("Zombie", 100);

    @Test
    void WarriorAttacksTest() {
        warrior.attackEnemy(zombie);
        Assertions.assertEquals(93, zombie.getHealth());
    }
}
