package com.rakovets.course.java.core.practice.lambda_expressions.CityHelper;

import java.util.ArrayList;
import java.util.List;

public class UtilityClass {

    public List<String> getCitiesList (List<String> cities) {
        return new ArrayList<>(cities);
    }

    public static void getCities(List<String> cities) {
        cities.stream()
                .forEach(System.out::println);
    }

    public static void getCitiesNameLength(List<String> list) {
        list.stream()
                .filter(s -> s.length() > 6)
                .forEach(System.out::println);
    }

    public static void getDistinctCities(List<String> list) {
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void getStartsWithLetter(List<String> list, char letter) {
        list.stream()
                .filter(s -> s.indexOf(letter) == 0)
                .forEach(System.out::println);
    }

    public static int getNumbersOfCities(List<String> list, String name) {
        return (int) list.stream()
                .filter(s -> s.equals(name))
                .count();
    }
    public static void main(String[] args) {
        UtilityClass utilityClass = new UtilityClass();
        List<String> cities = new ArrayList<>(List.of("Parisss", "Moscow", "London", "London"));
        System.out.println(getNumbersOfCities(cities, "London"));
    }
}
