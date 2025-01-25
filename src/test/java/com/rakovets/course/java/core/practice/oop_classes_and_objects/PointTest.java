package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    @DisplayName("test getDistance")
    void tesGetDistance() {
        Point point1 = new Point(0,0);
        Point point2 = new Point(2,0);
        double actual = point1.getDistance(point1, point2);

        Assertions.assertEquals(2, actual);
    }
}
