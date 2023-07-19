package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PairTest {
    static Stream<Arguments>provideArgumentsForGetSwapped() {
        return Stream.of(
                Arguments.of(new Pair<>("number", 1), "1 number"),
                Arguments.of(new Pair<>(1,"number"), "number 1"),
                Arguments.of(new Pair<>("number", null), "null number")
        );
    }

    @ParameterizedTest(name = "Pair getSwappedTest")
    @MethodSource("provideArgumentsForGetSwapped")
    void getSwappedTest(Pair<Object, Object> pair1, String expected) {
        Pair pair2 = pair1.getSwapped();
        String actual = pair2.getFieldK() + " " +pair2.getFieldV();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments>provideArgumentsForSwap() {
        return Stream.of(
                Arguments.of(new Pair<>("number", 1), "1 number"),
                Arguments.of(new Pair<>(1,"number"), "number 1"),
                Arguments.of(new Pair<>("number", null), "null number")
        );
    }

    @ParameterizedTest(name = "Pair swapTest")
    @MethodSource("provideArgumentsForGetSwapped")
    void swapTest(Pair<Object, Object> pair1, String expected) {
        Pair pair2 = Pair.swap(pair1);
        String actual = pair2.getFieldK() + " " +pair2.getFieldV();
        Assertions.assertEquals(expected, actual);
    }
}
