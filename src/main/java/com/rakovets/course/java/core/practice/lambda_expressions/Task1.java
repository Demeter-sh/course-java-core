package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public <K> Map<K, K> arrayToMap(K[] line) {
        return Stream.iterate(0, x -> x < line.length, x -> x + 2)
                .collect(Collectors.toMap(
                        x -> line[x],
                        x -> line[x + 1]
                ));
    }

    public String[] mapToArray(Map<String, String> map) {
        return map.entrySet().stream()
                .flatMap(x -> Stream.of(x.getKey(), x.getValue()))
                .toArray(String[]::new);
    }
}
