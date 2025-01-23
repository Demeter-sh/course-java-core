package com.rakovets.course.java.core.practice.oop_principles.BattleGround;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Battle ground test")
class BattleGroundTest {

    static Stream<Arguments> provideArgumentsForTime() {
        return Stream.of(
                Arguments.of(new Warrior("Warrior"), new Enemy(13).getHealth()),
                Arguments.of(new Mag("Mag"), new Enemy(12).getHealth()),
                Arguments.of(new Archer("Archer"), new Enemy(11).getHealth())
        );
    }

    @ParameterizedTest(name = "Hero attacks")
    @MethodSource("provideArgumentsForTime")
    @DisplayName("Heroes attacks enemy")
    void heroAttacksEnemy(Hero hero, int expected) {
        Enemy enemy1 = new Enemy();
        hero.attackEnemy(enemy1);
        Assertions.assertEquals(expected, enemy1.getHealth());
    }

    @Test
    @DisplayName("Enemy is alive")
    void enemyIsAliveTest() {
        Enemy enemy = new Enemy(10);

        Assertions.assertTrue(enemy.isAlive());
    }

    static Stream<Arguments> provideArgumentsForHeroIsAlive() {
        return Stream.of(
                Arguments.of(new Warrior(), true),
                Arguments.of(new Warrior("W", 0), false),
                Arguments.of(new Mag(), true),
                Arguments.of(new Mag("M",0), false),
                Arguments.of(new Archer(), true),
                Arguments.of(new Archer("A", 0), false)
        );
    }

    @ParameterizedTest(name = "Is alive")
    @MethodSource("provideArgumentsForHeroIsAlive")
    @DisplayName("Hero is alive")
    void heroIsAliveTest(Hero hero, Boolean bool) {
        Assertions.assertEquals(hero.isAlive(), bool);
    }

    @Test
    @DisplayName("Enemy attacks hero")
    void enemyAttacksHeroTest() {
        Enemy enemy = new Enemy();
        Hero hero = new Archer();
        enemy.attackHero(hero);

        Assertions.assertEquals(20, hero.getHealth());
    }
}
