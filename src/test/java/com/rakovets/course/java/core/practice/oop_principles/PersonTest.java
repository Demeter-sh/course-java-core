package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    Person person = new Person(50);
    Cat kate = new Cat("Kate");
    Persian persian = new Persian("Pers");
    Siamese siam = new Siamese("Siam");
    Sphynx sphynx = new Sphynx("Sphynx");
    @Test
    void changeHappinessTest() {
        person.changeHappiness(-5);
        Assertions.assertEquals(45,person.getHappiness());
    }

    @Test
    void setHappiness() {
        person.setHappiness(90);
        Assertions.assertEquals(90, person.getHappiness());
    }

    @Test
    void catMewTest() {
        kate.mew(person);
        Assertions.assertEquals(45, person.getHappiness());
    }

    @Test
    void catPurrTest() {
        kate.purr(person);
        Assertions.assertEquals(55, person.getHappiness());
    }
    @Test
    void persianMeowTest() {
        persian.mew(person);
        Assertions.assertEquals(44, person.getHappiness());
    }

    @Test
    void persianPurrTest() {
        persian.purr(person);
        Assertions.assertEquals(56, person.getHappiness());
    }

    @Test
    void siamMewTest() {
        siam.mew(person);
        Assertions.assertEquals(42, person.getHappiness());
    }

    @Test
    void siamPurrTest() {
        siam.purr(person);
        Assertions.assertEquals(58, person.getHappiness());
    }

    @Test
    void sphynxMewTest() {
        sphynx.mew(person);
        Assertions.assertEquals(41, person.getHappiness());
    }

    @Test
    void sphynxPurrTest() {
        sphynx.purr(person);
        Assertions.assertEquals(59, person.getHappiness());
    }
}
