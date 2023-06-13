package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    Siamese siamese = new Siamese("Flint");

    @Test
    void mewTest() {
        String actual = siamese.getName();
        Assertions.assertEquals("Flint", actual);
    }

    @Test
    void getNameTest() {
        String actual = siamese.getName();
        Assertions.assertEquals("Flint", actual);
    }

    @Test
    void purrTest() {
        String actual = siamese.purr();
        Assertions.assertEquals("frrr", actual);
    }
}
