package com.rakovets.course.java.core.practice.concurrency;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class FileUtil {
    Logger logger = Logger.getLogger(FileUtil.class.getName());
    public void rewriteFromOneSaveToAnotherFile(File fileForReader, File fileForWriter)  {
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

    public List<String> getWordsEndsWithVowelNextWord(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            String[] stringArray = stringBuilder.toString()
                    .replaceAll("[,./?!@#$%^&*()\\-_+=]","")
                    .split(" +");

            IntStream.rangeClosed(0, stringArray.length - 2)
                    .boxed()
                    .filter(n -> stringArray[n].toUpperCase().substring(stringArray[n].length() -1)
                            .equals(stringArray[n + 1].toUpperCase().substring(0, 1)))
                    .forEach(n -> list.add(stringArray[n]));
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
        return list;
    }

    public List<String> getListOfNumbers(File file) {
        StringBuilder stringBuilderFile = new StringBuilder();
        List<String> listOfDistinctNumbers = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                stringBuilderFile.append((char) c);
            }

            String[] stringsArrayOfNumber = stringBuilderFile.toString().split("\n");
            for (String string : stringsArrayOfNumber) {
                StringBuilder stringBuilderOfNumber = new StringBuilder();
                Arrays.stream(string.split(" "))
                        .distinct()
                        .limit(3)
                        .forEach(stringBuilderOfNumber::append);
                listOfDistinctNumbers.add(stringBuilderOfNumber.toString());
                stringBuilderOfNumber.delete(0, stringBuilderOfNumber.length());
            }

        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
        return listOfDistinctNumbers;
    }

    public Map<String, Integer> getRepetitionLettersInText(File file) {
        Map<String, Integer> map = new HashMap<>();
        char[] charArraysOfLetters = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            StringBuilder stringBuilderReader = new StringBuilder();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilderReader.append(string);
            }

            for (char c : charArraysOfLetters) {
                int count = stringBuilderReader.toString().length() - stringBuilderReader.toString().replace(String.valueOf(c), "").length();
                    map.put(String.valueOf(c), count);

            }

        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
        return map;
    }

    public Map<String, Integer> getWordsRepetitionInText(File file) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilderReader = new StringBuilder();
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilderReader.append(string);
            }
            stringBuilderReader = new StringBuilder(stringBuilderReader.toString().replaceAll("[.,/?!]", " "));

            for (String s : stringBuilderReader.toString().split(" ")){
                int count = (stringBuilderReader.toString().length() - stringBuilderReader.toString().replace(s, "").length()) / s.length();
                map.put(s, count);
            }
        } catch (IOException IOEx) {
            logger.warning(IOEx.getMessage());
        }
        return map;
    }
}
