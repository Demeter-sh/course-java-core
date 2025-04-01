package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1Test {
    @Test
    @DisplayName("turnArrayToMap")
    void turnArrayToMapTest() {
        Task1 t1 = new Task1();
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("-i", "in.txt");
        expectedMap.put("--limit", "40");
        expectedMap.put("-d", "1");
        expectedMap.put("-o", "out.txt");

        Map<String, String> actualMap = t1.turnArrayToMap();
        Assertions.assertEquals(expectedMap, actualMap);
    }

    @Test
    @DisplayName("turnMapToArray")
    void turnMapToArrayTest() {
        Task1 t1 = new Task1();
        Map<String, String> map = new HashMap<>();
        map.put("-i", "in.txt");
        map.put("--limit", "40");
        map.put("-d", "1");
        map.put("-o", "out.txt");

        String[] expectedArrayString = new String[] {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Arrays.sort(expectedArrayString);

        String[] actualArrayString = t1.turnMapToArray(map);
        Arrays.sort(actualArrayString);
        Assertions.assertArrayEquals(expectedArrayString, actualArrayString);
    }
}
