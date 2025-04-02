package com.rakovets.course.java.core.practice.lambda_expressions.City_Heplper;

import java.util.List;

public class CityHelper {
    List<String> list;

    public CityHelper(List<String> list) {
        this.list = list;
    }

    //получение количества употребления конкретного города в списке
    public void getAllCities() {
        list.forEach(System.out::println);
    }

    public void getAllUniqueCities() {
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public void getCitiesWithSixLetters() {
        list.stream()
                .filter(x -> x.length() == 6)
                .distinct()
                .forEach(System.out::println);
    }

    public void getCitiesThatStartsWIthLetter(String letter) {
        list.stream()
                .filter(x -> x.startsWith(letter))
                .forEach(System.out::println);
    }

    public long getQuantityOfWordRepetition(String city) {
        return list.stream()
                .filter(x -> x.equals(city))
                .count();
    }
}
