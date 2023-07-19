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
                Arguments.of(new Obscure<String>("zxcxz"), true),
                Arguments.of(new Obscure<>(123456), true)
        );
    }

    @ParameterizedTest(name = "Obscure: isPresent")
    @MethodSource("provideArgumentsForIsObscure")
    void isObscureTest(Obscure obscure, boolean expect){
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
    void isEmptyTest(boolean expected, Obscure obscure) {
        boolean actual = obscure.isEmpty();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForOrElse() {
        return Stream.of(
                Arguments.of(new Obscure<Integer>(123), 123, 123),
                Arguments.of(new Obscure<Integer>(123), 12, 123)
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
                Arguments.of(new Obscure<>("Some line"), new Exception(), "Some line"),
                Arguments.of(new Obscure<>(null), new Exception(), new Exception().getMessage()),
                Arguments.of(new Obscure<>(), new Exception(), null)
        );
    }

    @ParameterizedTest(name = "orElseThrow")
    @MethodSource("provideArgumentsForOrElseThrow")
    void orElseThrowTest(Obscure<String> obscure, Exception ex, String expected) throws Exception {
        String actual = "";
        try {
            actual = obscure.orElseThrow(ex);
        } catch (Exception ex0) {
            actual = ex.getMessage();
        }
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ofTest() {
        Obscure<String> actual = Obscure.of("Line");
        Obscure<String> expected = Obscure.of("Line");

        Assertions.assertEquals(expected.getObcureOblect(), actual.getObcureOblect());
    }

    @Test
    void EmptyTest() {
        Obscure<String> actual = Obscure.empty();


        Assertions.assertEquals(null, actual.getObcureOblect());
    }
}
