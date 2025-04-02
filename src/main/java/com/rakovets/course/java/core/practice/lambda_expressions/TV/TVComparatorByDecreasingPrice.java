package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;

public class TVComparatorByDecreasingPrice implements Comparator<TV> {
    @Override
    public int compare(TV o1, TV o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
