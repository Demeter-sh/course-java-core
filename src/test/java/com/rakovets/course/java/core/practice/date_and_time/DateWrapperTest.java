package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateWrapperTest {

    DateWrapper1 dateWrapper = new DateWrapper1();
    LocalDate localDate = LocalDate.of(2024, 1, 1);
    LocalDate localDate1 = LocalDate.of(2023,12,1);
    @Test
    void getDataFormatTest() {
        Month actual = dateWrapper.datePlusMonth(localDate, 10).getMonth();
        Month expected = Month.NOVEMBER;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDataPatternTest() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate actual = dateWrapper.getDataPattern(dateTimeFormatter, "1 января 2024");
        LocalDate expected = LocalDate.of(2024, 1, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDaySum() {
        int actual = dateWrapper.getDaySum(localDate1, localDate);
        int expected = 31;
        Assertions.assertEquals(expected, actual);
    }

}
