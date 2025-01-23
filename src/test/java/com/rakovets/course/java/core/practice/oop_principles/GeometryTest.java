package com.rakovets.course.java.core.practice.oop_principles;

import com.rakovets.course.java.core.practice.oop_principles.Geometry.Line;
import com.rakovets.course.java.core.practice.oop_principles.Geometry.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeometryTest {

    @Test
    @DisplayName("Distance between two points")
    void getDistanceTest() {
        Point aCoordinate = new Point(10,0,0);
        Point bCoordinate = new Point(-2,0,0);
        Line line1 = new Line(aCoordinate, bCoordinate);

        Assertions.assertEquals(12.0, line1.getDistance());
    }
}
