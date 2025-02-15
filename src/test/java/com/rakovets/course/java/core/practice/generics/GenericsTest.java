package com.rakovets.course.java.core.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Generics test")
public class GenericsTest {
    Obscure<String> obscure = new Obscure<>("Line");

    @Test
    @DisplayName("Test get")
    void getTest() {
        String actual = obscure.get();

        Assertions.assertEquals("Line", actual);
    }

    static Stream<Arguments> provideArgumentsForTestIsPresent() {
        return Stream.of(Arguments.of(new Obscure<>("Line"), true),
                Arguments.of(new Obscure<>(null), false),
                Arguments.of(new Obscure<>(232), true));
    }

    @ParameterizedTest(name = "{1}")
    @MethodSource("provideArgumentsForTestIsPresent")
    @DisplayName("Test is present")
    void testIsPresent(Obscure<String> o, boolean expected) {
        Assertions.assertEquals(expected, o.isPresent());
    }

    static Stream<Arguments> provideArgumentsForIsEmpty() {
        return Stream.of(Arguments.of(new Obscure<>("line"), false),
                Arguments.of(new Obscure<>(null), true),
                Arguments.of(new Obscure<>(120), false));
    }

    @ParameterizedTest(name = "{1}")
    @MethodSource("provideArgumentsForIsEmpty")
    @DisplayName("Test isEmpty")
    void testIsEmpty(Obscure<String> o, boolean expected) {
        Assertions.assertEquals(expected, o.isEmpty());
    }

    static Stream<Arguments> provideArgumentsForElse() {
        return Stream.of(Arguments.of(new Obscure<>("line"), "line", "line"),
                Arguments.of(new Obscure<>("line"), "red", "line"),
                Arguments.of(new Obscure<>(null), "red", "red"),
                Arguments.of(new Obscure<>(123), 123, 123),
                Arguments.of(new Obscure<>(123), 124, 123));
    }

    @ParameterizedTest(name = "{2}")
    @MethodSource("provideArgumentsForElse")
    <T> void testForElse(Obscure<T> o, T arg, T expected) {
        Assertions.assertEquals(expected, o.orElse(arg));
    }

    static Stream<Arguments> provideArgumentsForOrElseThrow() {
        return Stream.of(Arguments.of(new Obscure<>("line"), new Exception("Word"), "line"));
    }

    @ParameterizedTest(name = "{2}")
    @MethodSource("provideArgumentsForOrElseThrow")
    @DisplayName("Test orElseThrow")
    <T> void testOrElseThrow(Obscure<T> o, Exception ex, T expected) throws Exception {
        Assertions.assertEquals(expected, o.orElseThrow(ex));
    }

    @Test
    @DisplayName("Test of")
    void testOf () {
        Obscure<String> actual = Obscure.of("Line");
        Assertions.assertEquals(obscure.get(), actual.get());
    }

    @Test
    @DisplayName("Test empty")
    void testEmpty() {
        Obscure<String> expected = new Obscure<>(null);
        Obscure<String> actual = Obscure.empty();

        Assertions.assertEquals(expected.get(), actual.get());
    }
}
