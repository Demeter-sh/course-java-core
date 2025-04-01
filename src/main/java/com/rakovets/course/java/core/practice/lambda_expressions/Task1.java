package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public Map<String, String> turnArrayToMap() {
        String[] array = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

        return Stream.iterate(0, x -> x + 2)
                .limit(array.length / 2)
                .collect(Collectors.toMap(
                        x -> array[x],
                        x -> array[x + 1]
                ));
    }

    public String[] turnMapToArray(Map<String, String> map) {
        return map.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
    }
}
