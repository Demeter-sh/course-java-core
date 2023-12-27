package com.rakovets.course.java.core.practice.lambda_expressions.Project_TV;

import java.util.List;

public class Utility_class {
     public static void getTvByDiagonal(List<Televisor> list, int diagonal) {
         list.stream()
                 .filter(s -> s.getDiagonal() == diagonal)
                 .forEach(System.out::println);
     }

    public static void getTvByManufacturer(List<Televisor> list, String manufacturer) {
        list.stream()
                .filter(s -> s.getManufacturer().equals(manufacturer))
                .forEach(System.out::println);
    }

    public static void getTvByYear(List<Televisor> list, int year) {
        list.stream()
                .filter(s -> s.getYear() < year)
                .forEach(System.out::println);
    }

    public static void getTvByPrice(List<Televisor> list, int priceFrom, int priceTo) {
        list.stream()
                .filter(s -> s.getPrice() > priceFrom && s.getPrice() < priceTo)
                .forEach(System.out::println);
    }

    public static void getTvByUpperPrice(List<Televisor> list) {
        list.stream()
                .sorted(new UpperPriceComparator())
                .forEach(System.out::println);
    }

    public static void getTvByLowerPrice(List<Televisor> list) {
        list.stream()
                .sorted(new LowerPriceTvComparator())
                .forEach(System.out::println);
    }

    public static void getTvByUpperDiagonal(List<Televisor> list) {
        list.stream()
                .sorted(new TvByUpperDiagonalComparator())
                .forEach(System.out::println);
    }

    public static void getTvByLowerDiagonal(List<Televisor> list) {
        list.stream()
                .sorted(new UpperPriceComparator())
                .forEach(System.out::println);
    }
}
