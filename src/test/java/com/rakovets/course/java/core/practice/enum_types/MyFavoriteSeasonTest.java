package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFavoriteSeasonTest {
    SeasonsOfYear summer = SeasonsOfYear.SUMMER;
    SeasonsOfYear autumn = SeasonsOfYear.AUTUMN;
    SeasonsOfYear winter = SeasonsOfYear.WINTER;

    SeasonsOfYear spring = SeasonsOfYear.SPRING;

    @Test
    void getMyFavoriteSeasonSummerTest() {
        String actual = summer.getMyFavoriteSeason(summer);
        String expected = "I love summer. Average temperature - 30";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMyFavoriteSeasonAutumnTest() {
        String actual = autumn.getMyFavoriteSeason(autumn);
        String expected = "I love autumn. Average temperature - 10";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMyFavoriteSeasonWinterTest() {
        String actual = winter.getMyFavoriteSeason(winter);
        String expected = "I love winter. Average temperature - -10";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getMyFavoriteSeasonSpringTest() {
        String actual = spring.getMyFavoriteSeason(spring);
        String expected = "I love spring. Average temperature - 14";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDescriptionSummerTest() {
        String actual = summer.getDescription();
        String expected = "Hot season of year";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDescriptionWinterTest() {
        String actual = winter.getDescription();
        String expected = "Cold season of year";
        Assertions.assertEquals(expected, actual);
    }
}
