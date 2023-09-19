package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ObscureTest {
    static Stream<Arguments> provideArgumentsForIsObscure() {
        return Stream.of(
                Arguments.of( new Obscure<>(null), false),
                Arguments.of(new Obscure<>("zxcxz"), true),
                Arguments.of(new Obscure<>(123456), true)
        );
    }

    @ParameterizedTest(name = "Obscure: isPresent")
    @MethodSource("provideArgumentsForIsObscure")
    void isObscureTest(Obscure<Object> obscure, boolean expect){
        boolean actual = obscure.isPresent();

        Assertions.assertEquals(expect, actual);
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(
                Arguments.of(true, new Obscure<String>(null)),
                Arguments.of(true, new Obscure<>(null)),
                Arguments.of(false, new Obscure<>(123456))
        );
    }

    @ParameterizedTest(name = "Obscure: isEmpty")
    @MethodSource("provideArgumentsForIsEmpty")
    void isEmptyTest(boolean expected, Obscure<Object> obscure) {
        boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Obscure<>(123), 123, 123),
                Arguments.of(new Obscure<>(123), 12, 123)
        );
    }

    @ParameterizedTest(name = "Obscure: orElse")
    @MethodSource("provideArgumentsForOrElse")
    void orElseTest(Obscure<Integer> obscure, Integer number, Integer expected) {
        Integer actual = obscure.orElse(number);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(
                Arguments.of(new Obscure<>("Some line"), "Some line"),
                Arguments.of(new Obscure<>(null), new Exception().getMessage()),
                Arguments.of(new Obscure<>(), new Exception().getMessage())
        );
    }

    @ParameterizedTest(name = "orElseThrow")
    @MethodSource("provideArgumentsForOrElseThrow")
    void orElseThrowTest(Obscure<String> obscure,  String expected) {
        Assertions.assertEquals(expected, obscure.orElseThrow());
    }

    @Test
    void ofTest() {
        Obscure<String> actual = new Obscure<>("Null");
        Obscure<String> expected = Obscure.of(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void EmptyTest() {
        Obscure<String> actual = Obscure.empty();


        Assertions.assertNull(null, actual.getObscureObject());
    }
}
