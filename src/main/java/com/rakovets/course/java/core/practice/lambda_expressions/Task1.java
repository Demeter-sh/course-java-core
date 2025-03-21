package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    String[] array = new String[]{"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};

    public Map<String, String> convertArrayToMap(String[] array) {
        return Stream.of(array)
                .collect(Collectors.toMap(
                        Function.identity(),
                        Function.identity()
                ));
    }

    public String[] convertMapToArray(Map<String, String> argsMap) {
        String[] args = argsMap.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
        return args;
    }
    public static void main(String[] args) {
        Map<String, String> bookMap = new HashMap<>();

        bookMap.put("Robert C. Martin", "Clean Code");
        bookMap.put("Joshua Bloch", "Effective Java");
        for (String key : bookMap.keySet()) {
            System.out.println("key: " + key + " value: " + bookMap.get(key));
        }
        for (Map.Entry<String, String> book: bookMap.entrySet()) {
            System.out.println("key: " + book.getKey() + " value: " + book.getValue());
        }
    }
}
