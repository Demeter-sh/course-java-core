package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Persian;
import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Person;
import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Siamese;
import com.rakovets.course.java.core.practice.oop_principles.Cats_home.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Cat House")
public class CatHouseTest {
    Person person1 = new Person();
    Persian persianFlint = new Persian("Flint");
    Siamese siameseSmoke = new Siamese("Smoke");
    Sphynx sphinxNeal = new Sphynx("Neal");

    static Stream<Arguments> provideArgumentsForPersianCatPurrs() {
        return Stream.of(
                Arguments.of(new Person(), new Person(14)),
                Arguments.of(new Person(12), new Person(16))
        );
    }

    @ParameterizedTest(name = "Purr")
    @MethodSource("provideArgumentsForPersianCatPurrs")
    @DisplayName("Cat Purrs")
    void persianCatPurrsTest(Person person, Person personExpected) {
        persianFlint.purr(person);
        Assertions.assertEquals(personExpected, person);
    }

    @Test
    void TestPersianPurrs() {
        Person actualPerson = new Person(14);
        persianFlint.purr(person1);
        Assertions.assertEquals(person1.getHappiness(), actualPerson.getHappiness());
    }

    @Test
    void TestPersianMews() {
        Person actualPerson = new Person(6);
        persianFlint.mew(person1);
        Assertions.assertEquals(person1.getHappiness(), actualPerson.getHappiness());
    }

    @Test
    void TestSiameseMews() {
        Person actualPerson = new Person(4);
        siameseSmoke.mew(person1);
        Assertions.assertEquals(person1.getHappiness(), actualPerson.getHappiness());
    }

    @Test
    void TestSiamesePurrs() {
        siameseSmoke.purr(person1);
        Assertions.assertEquals(person1.getHappiness(), new Person(16).getHappiness());
    }

    @Test
    void TesSphinxPurrs() {
        sphinxNeal.purr(person1);
        Assertions.assertEquals(person1.getHappiness(), new Person(17).getHappiness());
    }

    @Test
    void TestSphinxMew() {
        sphinxNeal.mew(person1);
        Assertions.assertEquals(person1.getHappiness(), new Person(3).getHappiness());
    }
}
