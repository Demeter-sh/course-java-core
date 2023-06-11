package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
