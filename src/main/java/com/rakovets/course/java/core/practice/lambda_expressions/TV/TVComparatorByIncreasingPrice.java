package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;

public class TVComparatorByIncreasingPrice implements Comparator<TV> {
    @Override
    public int compare(TV o1, TV o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
