package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.List;

public class RandomArraysCreator {
    private int arrayLength;
    private int numberOfArrays;
    private int numberForRandom;
    private final List<int[]> listOfRandomArrayNumbers = new ArrayList<>();

    public RandomArraysCreator(int arrayLength, int numberOfArrays, int numberForRandom) {
        this.arrayLength = arrayLength;
        this.numberOfArrays = numberOfArrays;
        this.numberForRandom = numberForRandom;
        }

    public List<int[]> createListOfRandomArrays() {
        for (int i = 0; i < numberOfArrays; i++) {
            int[] integerArray = new int[arrayLength];
            listOfRandomArrayNumbers.add(integerArray);
            for (int j = 0; j < arrayLength; j++) {
                integerArray[j] = (int) (Math.random() * numberForRandom);
            }
        }
        return listOfRandomArrayNumbers;
    }
}
