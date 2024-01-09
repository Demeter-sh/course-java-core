package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWrapper1 {
    public LocalDate getDate(int year, int month, int day){
        return LocalDate.of(year, month, day);
    }

    public LocalDate datePlusMonth(LocalDate localDate, int month) {
        return localDate.plusMonths(month);
    }

    public String getDataString(LocalDate localDate, DateTimeFormatter dateTimeFormatter) {
        return localDate.format(dateTimeFormatter);
    }

    public LocalDate getDataPattern(DateTimeFormatter dateTimeFormatter, String s) {
        return LocalDate.parse(s, dateTimeFormatter);
    }

    public int getDaySum(LocalDate localDate1, LocalDate localDate2) {
        return (int) (localDate2.toEpochDay() - localDate1.toEpochDay());
    }
    public static void main(String[] args) {

    }
}
