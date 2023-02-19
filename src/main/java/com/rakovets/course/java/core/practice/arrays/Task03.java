package com.rakovets.course.java.core.practice.arrays;

import com.rakovets.course.java.core.util.NumberUtil;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {5, 4, 6}, {4, 9, 6}, {9, 1, 6}
        };

        double[] averageMark = getAverageMarks(marks);
        System.out.printf("Average mark: %s\n", Arrays.toString(averageMark));
        int[] minMark = getMinMarks(marks);
        System.out.printf("Min mark: %s\n", Arrays.toString(minMark));
        int[] maxMark = getMaxMarks(marks);
        System.out.printf("Max mark: %s\n", Arrays.toString(maxMark));
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMarks(int[][] marks) {
        double[] averageMarks = new double[marks.length];
        double average;
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            NumberUtil.roundValueToTwoDigitsForMantissa(average = sum / 3);
            sum = 0.0;
            averageMarks [i] = NumberUtil.roundValueToTwoDigitsForMantissa(average);
        }
        return averageMarks;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMarks(int[][] marks) {
        int[] minMark = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int min = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) { //{5, 4, 6}, {4, 9, 6}, {9, 1, 6}
                if (min > marks[i][j]) {
                    min = marks[i][j];
                }
                minMark[i] = min;
            }
        }
        return minMark;
    }

    /**
     * Возвращает максимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMarks(int[][] marks) {
        int[] maxMark = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int min = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) { //{5, 4, 6}, {4, 9, 6}, {9, 1, 6}
                if (min < marks[i][j]) {
                    min = marks[i][j];
                }
                maxMark[i] = min;
            }
        }
        return maxMark;
    }
}
