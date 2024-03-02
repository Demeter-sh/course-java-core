package com.rakovets.course.java.core.practice.io.file_util;

import java.io.FileReader;
import java.io.FileWriter;

public class FileUtil {
    FileWriter input;
    FileReader output;
    public FileUtil(FileWriter input, FileReader output) {
        this.input = input;
        this.output = output;
    }


}
