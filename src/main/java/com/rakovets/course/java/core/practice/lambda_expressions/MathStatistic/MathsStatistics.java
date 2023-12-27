package com.rakovets.course.java.core.practice.lambda_expressions.MathStatistic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MathsStatistics {

    public List<Integer> getRandom(int number) {
        List<Integer> arrayList = Stream.iterate(0, x -> x < number, x -> x + 1)
                .map(x -> (int) (x * Math.random() * number))
                .collect(Collectors.toList());
        return arrayList;
    }
    public int method(List<Integer> arrayList) {
        return (int) arrayList.stream()
                .filter(x -> x % 2 ==0)
                .count();
    }
    public static void main(String[] args) {
    }
}
