package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Time")
public class TimeTest {
    Time time0 = new Time(3665);
    Time time1 = new Time(1, 1, 1);
@Test
    void Test1Time() {
    int actual = time0.getHours();
    Assertions.assertEquals(1, actual);
}

@Test
    void Test2Time() {
    int actual = time0.getMinutes();
    Assertions.assertEquals(1, actual);
}

@Test
    void Test3Time() {
    int actual = time0.getSeconds();
    Assertions.assertEquals(5, actual);
}

@Test
    void Test4() {
    int actual = time1.getTotalSeconds();
    Assertions.assertEquals(3661, actual);
}
}
