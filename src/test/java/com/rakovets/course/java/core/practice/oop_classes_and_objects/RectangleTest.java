package com.rakovets.course.java.core.practice.oop_classes_and_objects;
 import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Rectangle")
public class RectangleTest {
    Rectangle rectangle = new Rectangle(new Point(2,7), new Point(4, 2));
    Point pointTest = new Point(3, 3);

    @Test
    void TestSetTopLeftPoint() {
            rectangle.setTopLeftPoint(pointTest);
            assertEquals(pointTest, rectangle.getTopLeftPoint());
        }

    @Test
    void getPerimeterTest() {
        int actual = rectangle.getPerimeter();
        assertEquals(14, actual);
    }

    @Test
    void getAreaTest() {
        int actual = rectangle.getArea();
        assertEquals(10, actual);
    }
}
