package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class FileUtil {
    Logger logger = Logger.getLogger(FileUtil.class.getName());
    public void rewriteFromOneSaveToAnotherFile(File fileForReader, File fileForWriter) {
        StringBuilder stringBuilderFileRead = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileForReader)){
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilderFileRead.append((char) c);
            }
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }

        try (FileWriter fileWriter = new FileWriter(fileForWriter)){
            fileWriter.write(stringBuilderFileRead.toString());
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
    }
}
