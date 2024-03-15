package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.util.List;
import java.util.ListIterator;

public class FileUtilDemo {
    public static void main(String[] args) {
        File fileForReader = new File("D://notes.txt");
        File fileForWriter = new File("D://notes3.txt");
        FileUtil fileUtil = new FileUtil();
        fileUtil.rewriteFromOneSaveToAnotherFile(fileForReader, fileForWriter);
        List<String> list = fileUtil.getStartsWithVowel3(fileForReader);
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
