package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.TV.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.TV.TV_UtilityClass;

import java.util.ArrayList;
import java.util.List;

public class TVDemo {
    public static void main(String[] args) {
        TV samsung = new TV("samsung", "Galaxy", 2008, 16.0, 170);
        TV lg = new TV("samsung", "Lg1", 2006, 17.0, 100);
        TV sony = new TV("Sony", "P5", 2007, 16.0, 160);
        List<TV> tvList = new ArrayList<>(List.of(samsung, lg, sony));
        TV_UtilityClass tv_UtilityClass = new TV_UtilityClass(tvList);

        //Получение тв заданной диагональю
        System.out.println("getTVByDiagonal()");
        tv_UtilityClass.getTVByDiagonal(16);

        //Получение тв с ценой в каком-то диапазоне
        System.out.println("\ngetTVByPrice()");
        tv_UtilityClass.getTVByPrice(160, 190);

        //Телевизоры отсортированные по цене (по возрастанию)
        System.out.println("\nsortTVByIncreasingPrice");
        tv_UtilityClass.sortTVByIncreasingPrice();

        //Телевизоры отсортированные по цене (по убыванию)
        System.out.println("\nsortTVByDecreasingPrice");
        tv_UtilityClass.sortTVByDecreasingPrice();
    }
}
