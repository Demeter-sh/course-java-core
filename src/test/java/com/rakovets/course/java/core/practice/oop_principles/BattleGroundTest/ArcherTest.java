package com.rakovets.course.java.core.practice.oop_principles.BattleGroundTest;

import com.rakovets.course.java.core.practice.oop_principles.Archer;
import com.rakovets.course.java.core.practice.oop_principles.Zombie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    Archer archer = new Archer("Archer", 100);
    Zombie zombie = new Zombie("Zombie", 100);

    @Test
    void ArcherAttacksTest() {
        archer.attackEnemy(zombie);
        Assertions.assertEquals(85, zombie.getHealth());
    }
}
