package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
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
        Pair<Object, Object> pair2 = pair1.getSwapped();
        String actual = pair2.getFirst() + " " +pair2.getSecond();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments>provideArgumentsForSwap() {
        return Stream.of(
                Arguments.of(new Pair<>("number", 1), "1 number"),
                Arguments.of(new Pair<>(2,"number"), "number 2"),
                Arguments.of(new Pair<>("number", null), "null number")
        );
    }

    @ParameterizedTest(name = "Pair swapTest")
    @MethodSource("provideArgumentsForSwap")
    void swapTest(Pair<Object, Object> pair1, String expected) {
        Pair<Object, Object> pair2 = Pair.swap(pair1);
        String actual = pair2.getFirst() + " " +pair2.getSecond();
        Assertions.assertEquals(expected, actual);
    }
}
