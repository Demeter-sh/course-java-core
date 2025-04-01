package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.Maths_statistics.MathStatistics;

import java.util.Arrays;
import java.util.List;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics ms = new MathStatistics();
        //генерация набора случайных целых чисел
        System.out.println("генерация набора случайных целых чисел generateRandomNumbers()");
        ms.generateRandomNumbers(5, 1, 10);

        //генерация набора случайных целых чисел в массив типа int
        System.out.println("\nгенерация набора случайных целых чисел в массив типа int generateRandomNumberInArray()");
        int[] intArray = ms.generateRandomNumberInArray(5, 1, 5);
        Arrays.stream(intArray).forEach(System.out::println);

        //генерация набора случайных целых чисел в List
        System.out.println("\nгенерация набора случайных целых чисел в List generateRandomNumberInCollection()");
        List<Integer> integerList = ms.generateRandomNumberInCollection(5, 1, 10);
        System.out.println(integerList);

        //генерация набора случайных четных целых чисел getEvenNumbers
        System.out.println("генерация набора случайных четных целых чисел getEvenNumbers");
        ms.getEvenNumbers(5, 1, 5);

        //генерация набора случайных нечетных целых чисел getEvenNumbers
        System.out.println("генерация набора случайных нечетных целых чисел getEvenNumbers");
        ms.getUnevenNumbers(5, 1, 5);
    }
}
