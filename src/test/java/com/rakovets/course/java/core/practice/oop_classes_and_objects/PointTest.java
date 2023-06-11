package com.rakovets.course.java.core.practice.oop_classes_and_objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PointTest {
Point point1 = new Point(1, 1);
Point point2 = new Point(1, 10);

@Test
    void testGetDistance() {
    int actual = point1.getDistance(point2);
    Assertions.assertEquals(9, actual);
}
}
