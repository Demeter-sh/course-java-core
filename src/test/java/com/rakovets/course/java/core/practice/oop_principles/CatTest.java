package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    Cat kate = new Cat("Kate");

    @Test
    void MewTest() {
        String actual = kate.mew();
        Assertions.assertEquals("mew", actual);
    }

    @Test
    void PurrTest() {
        String actual = kate.purr();
        Assertions.assertEquals("purr", actual);
    }

    @Test
    void getNameTest() {
        String actual = kate.getName();
        Assertions.assertEquals("Kate", actual);
    }

    @Test
    void setNameTest() {
        kate.setName("Alice");
        Assertions.assertEquals("Alice", kate.getName());
    }
}
