package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разработать программу для разбора (parsing) банковских отчетов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String bankReport = "the 1500s when only$12$ five c but 10.51$ also  12 into types11etting  unchanged. " +
                            "12.49$ It the 1960s with";

        double[] moneyFromReport = getArrayMoneyFromReport(bankReport);
        System.out.printf("Money from the report: %s\n", Arrays.toString(moneyFromReport));
        double sumMoneyFromReport = getSumMoneyFromReport(bankReport);
        System.out.printf("Sum money from the report: %s\n", sumMoneyFromReport);
    }

    /**
     * Возвращает список сумм, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return список сумм
     */
    static double[] getArrayMoneyFromReport(String report) {
        double[] number;
        Pattern pattern = Pattern.compile("\\s-?\\d+\\.?\\d+\\$\\s");
        Matcher matcher = pattern.matcher(report);
        int counter = 0;
        StringBuilder str = new StringBuilder();

        /* альтернатива
        String str = report.split("\\s");
        for (String str : strArgs){
            if(str.matches("-?\\d+\\.?\\d+\\$")) {
                counter++;
            }
        }
        */
        while (matcher.find()) {
            str.append(matcher.group(0));
            counter++;
        }

        number = new double[counter];
        String[] strArray = str.toString().split("\\$");

        for (int i = 0; i < counter; i++) {
            number[i] = Double.parseDouble(strArray[i]);
        }

        return number;
    }

    /**
     * Возвращает общую сумму всех денег, которые встречаются в отчете.
     *
     * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
     * @return общую сумму всех денег
     */
    static double getSumMoneyFromReport(String report) {
        String[] strArgs = report.split("\\s");
        double sumMoney = 0;

        for (String str : strArgs) {
            if (str.matches("-?\\d+\\.?\\d+\\$")) {
                sumMoney += Double.parseDouble(str.replace("$", ""));
            }
        }

        return sumMoney;
    }
}
