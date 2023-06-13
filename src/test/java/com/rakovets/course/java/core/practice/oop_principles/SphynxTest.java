package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Cat sphynx = new Sphynx("Sphynx");

    @Test
    void MewTest() {
        String actual = sphynx.mew();
        Assertions.assertEquals("niaw", actual);
    }

    @Test
    void PurrTest() {
        String actual = sphynx.purr();
        Assertions.assertEquals("mrrr", actual);
    }
}
