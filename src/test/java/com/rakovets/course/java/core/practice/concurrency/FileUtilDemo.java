package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.util.List;

public class FileUtilDemo {
    public static void main(String[] args) {
        File fileForReader = new File("D://notes.txt");
        File fileForWriter = new File("D://notes3.txt");
        File fileNumbers = new File("D://NumberCombination.txt");
        FileUtil fileUtil = new FileUtil();
        fileUtil.rewriteFromOneSaveToAnotherFile(fileForReader, fileForWriter);
        List<String> list = fileUtil.getWordsEndsWithVowelNextWord(fileForReader);
        for (String string : list) {
            System.out.println(string);
        }

        List<String> listOfNumbers = fileUtil.getListOfNumbers(fileNumbers);
        for (String listOfNumber : listOfNumbers) {
            System.out.println(listOfNumber);
        }
    }
}
