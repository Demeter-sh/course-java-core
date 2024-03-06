package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;

public class FileUtilDemo {
    public static void main(String[] args) {
        File fileForReader = new File("D://notes.txt");
        File fileForWriter = new File("D://notes3.txt");
        FileUtil fileUtil = new FileUtil();
        fileUtil.rewriteFromOneSaveToAnotherFile(fileForReader, fileForWriter);
    }
}
