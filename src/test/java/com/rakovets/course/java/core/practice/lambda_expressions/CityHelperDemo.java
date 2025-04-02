package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.City_Heplper.CityHelper;

import java.util.ArrayList;
import java.util.List;

public class CityHelperDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>(List.of("Moscow", "Moscow", "Minsk", "Mogilev", "Grodno"));
        CityHelper ch = new CityHelper(cities);
        //получение всех городов getAllCities
        System.out.println("получение всех городов getAllCities()");
        ch.getAllCities();

        //получение всех уникальных городов getAllUniqueCities
        System.out.println("получение всех уникальных городов getAllUniqueCities()");
        ch.getAllUniqueCities();

        //получение городов с названием, которое длиннее шесть символов
        System.out.println("получение городов с названием, которое длиннее шесть символов getCitiesWithSixLetters()");
        ch.getCitiesWithSixLetters();

        //получение городов начинающихся на заданную букву
        System.out.println("получение городов начинающихся на заданную букву getCitiesWithSixLetters()");
        ch.getCitiesThatStartsWIthLetter("M");
    }
}
