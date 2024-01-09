package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapper2_0Test {
    @Test
    void adjustIntoTest() {
        DateWrapper2_0 dateWrapper = new DateWrapper2_0();
        LocalDate actual = (LocalDate) dateWrapper.adjustInto(LocalDate.of(2000, 1, 1));
        LocalDate expected = LocalDate.of(2000, 1, 6);

        Assertions.assertEquals(expected, actual);
    }
}
