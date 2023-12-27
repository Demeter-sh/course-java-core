package com.rakovets.course.java.core.practice.lambda_expressions.Project_TV;

import java.util.Comparator;

public class TvByUpperDiagonalComparator implements Comparator<Televisor> {
    @Override
    public int compare(Televisor o1, Televisor o2) {
        return -o1.getDiagonal() - o2.getDiagonal();
    }
}
