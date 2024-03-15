package com.rakovets.course.java.core.practice.concurrency;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {
    Logger logger = Logger.getLogger(FileUtil.class.getName());
    public void rewriteFromOneSaveToAnotherFile(File fileForReader, File fileForWriter) {
        StringBuilder stringBuilderFileRead = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileForReader);
                FileWriter fileWriter = new FileWriter(fileForWriter)){
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilderFileRead.append((char) c);
            }
            fileWriter.write(stringBuilderFileRead.toString().toUpperCase());
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
    }

    public List<String> getStartsWithVowel(File file) {
        List<String> listWithVowel = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }

        Pattern pattern = Pattern.compile("\\b[AaEeIiOoUuYy]\\w*\\b");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            listWithVowel.add(matcher.group());
        }
       return  listWithVowel;
    }

    public List<String> getStartsWithVowel2(File file) {
        List<String> listWithVowel = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }


        Pattern pattern = Pattern.compile("[,./?!@#$%^&*]");
        Matcher matcher = pattern.matcher(stringBuilder.toString());
        String[] strings = matcher.replaceAll("").split(" +");
        for (String s : strings) {
            String s1 = String.valueOf(s.charAt(0));
            if (s1.matches("[EeYyUuIiOoAa]")) {
                listWithVowel.add(s);
            }
        }
        return  listWithVowel;
    }

    public List<String> getStartsWithVowel3(File file) {
        List<String> listWithVowel = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            String[] strArray = stringBuilder.toString().replaceAll("[,./?!@#$%^&*()\\-_+=]","")
                    .split(" +");

            Arrays.stream(strArray)
                    .filter(x ->x.substring(0,1).matches("[EeYyUuIiOoAa]"))
                    .forEach(listWithVowel::add);
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }


        return  listWithVowel;
    }
}
