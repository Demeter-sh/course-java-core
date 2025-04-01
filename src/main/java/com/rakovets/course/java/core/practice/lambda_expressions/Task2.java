package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.stream.IntStream;

public class Task2 {
    public void multiplicationTableInOneColumn() {
        IntStream.rangeClosed(1, 10)
                .forEach(x -> {
                    for (int n = 1; n < 11; n++) {
                        System.out.printf("%d * %d = %d\n", x, n, x*n);
                    }
                });
    }

    public void multiplicationTableInOneColumn2() {
        IntStream.rangeClosed(1, 10)
                .boxed()
                .flatMap(x -> IntStream.rangeClosed(1, 10)
                        .mapToObj(y -> String.format("%d * %d = %d", x, y, x * y)))
                        .forEach(System.out::println);
    }

    public void multiplicationTableInFiveColumns() {
        IntStream.rangeClosed(1, 10)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(1, 5)
                        .mapToObj(j -> String.format("%d * %d = %d\t", i, j, j * i)))
                .forEach(x -> System.out.println(x + "\t"));
    }
}
