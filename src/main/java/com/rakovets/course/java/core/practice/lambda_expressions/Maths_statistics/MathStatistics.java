package com.rakovets.course.java.core.practice.lambda_expressions.Maths_statistics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MathStatistics {
    public void generateRandomNumbers(int numberQuantity, int minNumber, int maxNumber) {
        IntStream.generate(() -> (int) (Math.random() * (maxNumber - minNumber + 1)))
                .limit(numberQuantity)
                .forEach(System.out::println);
    }

    public int[] generateRandomNumberInArray(int numberQuantity, int minNumber, int maxNumber) {
        return IntStream.generate(() -> (int) (Math.random() * (maxNumber - minNumber + 1)))
                .limit(numberQuantity)
                .toArray();
    }

    public List<Integer> generateRandomNumberInCollection(int numberQuantity, int minNumber, int maxNumber) {
        return IntStream.generate(() -> (int) (Math.random() * (maxNumber - minNumber + 1)))
                .boxed()
                .limit(numberQuantity)
                .collect(Collectors.toList());
    }

    public void getEvenNumbers(int numberQuantity, int minNumber, int maxNumber) {
        IntStream.generate(() -> (int) (Math.random() * (maxNumber - minNumber + 1)))
            .filter(x -> x % 2 ==0)
            .limit(numberQuantity)
            .distinct()
            .forEach(System.out::println);
    }

    public void  getUnevenNumbers(int numberQuantity, int minNumber, int maxNumber) {
        IntStream.generate(() -> (int) (Math.random() * (maxNumber - minNumber + 1)))
            .filter(x -> x % 2 !=0)
            .limit(numberQuantity)
            .distinct()
            .forEach(System.out::println);
    }
}
