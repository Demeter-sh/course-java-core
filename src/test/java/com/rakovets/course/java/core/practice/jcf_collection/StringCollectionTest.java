package com.rakovets.course.java.core.practice.jcf_collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringCollectionTest {
    StringCollectionUtil smth = new StringCollectionUtil();

    @Test
    void resetWordsByLengthTest() {
        List<String> actual = smth.makeList();
        smth.resetWordsByLength(actual, 4);
        List<String> expected = List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void removeWordsByLengthTest() {
        List<String> actual = smth.makeList();
        List<String> expected = List.of("is", "of", "fun", "for", "every", "programmer");
        smth.removeWordsByLength(actual, 4);
        Assertions.assertEquals(expected, actual);
    }
}
