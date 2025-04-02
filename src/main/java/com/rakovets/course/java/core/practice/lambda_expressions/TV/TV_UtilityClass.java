package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.List;

public class TV_UtilityClass {
    private List<TV> TVList;

    public TV_UtilityClass(List<TV> TVList) {
        this.TVList = TVList;
    }

    public void getTVByDiagonal(int diagonal) {
        TVList.stream()
                .filter(x -> x.getDiagonal() == diagonal)
                .forEach(System.out::println);
    }

    public void getTVByPrice(int loverPrice, int highPrice) {
        TVList.stream()
                .filter(x -> x.getPrice() >= loverPrice && x.getPrice() <= highPrice)
                .forEach(System.out::println);
    }

    public void sortTVByIncreasingPrice() {
        TVList.stream()
                .sorted(new TVComparatorByIncreasingPrice())
                .forEach(System.out::println);
    }

    public void sortTVByDecreasingPrice() {
        TVList.stream()
                .sorted(new TVComparatorByDecreasingPrice())
                .forEach(System.out::println);
    }
}
