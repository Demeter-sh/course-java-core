package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {
    public String multiTableWithCycle() {
        StringBuilder multiplyTable = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j < 6; j++) {
                int num = i * j;
                multiplyTable.append(String.format("%d * %d = %d ", j, i, num));
                if(num < 10) {
                    multiplyTable.append(" ");
                }
            }
            multiplyTable.append("\n");
        }
        multiplyTable.append("\n");

        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j < 10; j++) {
                int num = i * j;
                multiplyTable.append(String.format("%d * %d = %d ", j, i, num));
                if(num < 10) {
                    multiplyTable.append(" ");
                }
            }
            multiplyTable.append("\n");
        }

        return multiplyTable.toString();
    }

    public String multiTable() {
        return null;
    }

    public static void main(String[] args) {
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);

        List<String> s = IntStream.range(1, 10)
                .boxed()
                .flatMap(x -> IntStream.range(1, 10)
                        .mapToObj(i -> String.format("%d * %d = %d\n", x, i, i * x)))
                        .collect(Collectors.toList());
        System.out.println(s);
    }
}
