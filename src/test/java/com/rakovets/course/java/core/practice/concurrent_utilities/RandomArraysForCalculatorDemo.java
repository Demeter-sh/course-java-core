package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator.Calculator;
import com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator.RandomArraysCreator;

import java.util.List;
import java.util.Map;

public class RandomArraysForCalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("Calculator");
        RandomArraysCreator randomArraysCreator = new RandomArraysCreator(3, 4, 10);
        List<int[]> list = randomArraysCreator.createListOfRandomArrays();
        calculator.getSumOfNumbers(list);

        for (Map.Entry<Integer, int[]> mapEntrySet : calculator.getMapOfSumOfArrayNumbers().entrySet()) {
            System.out.printf("%d - %s\n", mapEntrySet.getKey(), Arrays.toString(mapEntrySet.getValue()));
        }

        calculator.getMapOfSumOfArrayNumbersThreads(list, 10);
    }
}
