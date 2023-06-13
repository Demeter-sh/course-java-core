package com.rakovets.course.java.core.practice.oop_principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {
    Persian pers = new Persian("Pers");

    @Test
    void MewTest() {
        String actual = pers.mew();
        Assertions.assertEquals("mewf", actual);
    }

    @Test
    void PurrTest() {
        String actual = pers.purr();
        Assertions.assertEquals("ffrr", actual);
    }
}
