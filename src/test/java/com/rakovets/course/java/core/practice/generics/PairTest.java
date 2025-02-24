package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PairTest {
    @Test()
    @DisplayName("Test getSwapped")
    void testGetSwapped() {
            Pair<Integer, Integer> pair = new Pair<>(1, 2);
            pair = pair.getSwapped();
        Assertions.assertEquals(2, pair.getField1());
    }

    @Test
    @DisplayName("Test swap")
    void testSwap() {
        Pair<Integer, Integer> pair = new Pair<>(1, 2);

        Assertions.assertEquals(2, pair.getField1());
    }

}
