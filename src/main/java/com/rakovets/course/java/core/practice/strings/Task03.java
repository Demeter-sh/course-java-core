package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для разбора (parsing) информации о персонале компании.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task03 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        String informationAboutStuff = INPUT_SCANNER.nextLine();

        String[] names = parseToArrayName(informationAboutStuff);
        System.out.printf("Names: %s\n", Arrays.toString(names));
        String[] surnames = parseToArraySurname(informationAboutStuff);
        System.out.printf("Surnames: %s\n", Arrays.toString(surnames));
        int[] salaries = parseToArraySalary(informationAboutStuff);
        System.out.printf("Salaries: %s\n", Arrays.toString(salaries));
    }

    static String[][] multiArrayAboutStuff(String informationAboutStuff) {
        String[] strArray = informationAboutStuff.split(";");
        String[][] multiStrArray = new String[strArray.length][1];

        for (int i = 0; i < strArray.length; i++) {
            multiStrArray[i][0] = strArray[i];
        }

        return multiStrArray;
    }
    /**
     * Возвращает массив имен персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив имен персонала, где каждый элемент является именем одного сотрудника
     */
    static String[] parseToArrayName(String informationAboutStuff) {
        String[] strArray = new String[informationAboutStuff.split(";").length];

        for (int i = 0; i < multiArrayAboutStuff(informationAboutStuff).length; i++){
            strArray [i] = multiArrayAboutStuff(informationAboutStuff)[i][0].split(" +")[0];
        }

        return strArray;
    }

    /**
     * Возвращает массив фамилий персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив фамилий персонала, где каждый элемент является фамилией одного сотрудника
     */
    static String[] parseToArraySurname(String informationAboutStuff) {
        String[] strArray = new String[informationAboutStuff.split(";").length];
        for (int i = 0; i < multiArrayAboutStuff(informationAboutStuff).length; i++){
            strArray [i] = multiArrayAboutStuff(informationAboutStuff)[i][0].split(" +")[1];
        }

        return strArray;
    }

    /**
     * Возвращает массив зарплат персонала.
     *
     * @param informationAboutStuff строка, которая содержит всю информацию
     * @return массив зарплат персонала, где каждый элемент является зарплатой одного сотрудника
     */
    static int[] parseToArraySalary(String informationAboutStuff) {
        String[] strArray = new String[informationAboutStuff.length()];
        int[] intArray = new int[informationAboutStuff.split(";").length];
        for (int i = 0; i < multiArrayAboutStuff(informationAboutStuff).length; i++){
            strArray [i] = multiArrayAboutStuff(informationAboutStuff)[i][0].split(" +")[2];
            intArray [i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }
}
