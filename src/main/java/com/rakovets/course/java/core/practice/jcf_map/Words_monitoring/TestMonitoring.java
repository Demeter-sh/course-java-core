package com.rakovets.course.java.core.practice.jcf_map.Words_monitoring;

import java.util.*;
import java.util.regex.Pattern;

public class TestMonitoring {

    public String getUniqueWordsFromText(String text) {
        StringBuilder stringBuilderOfUniqueWords = new StringBuilder();
        String[] textArray = text.split(" ");

        for (String s : textArray) {
            int num = 0;
            for (String s2 : textArray) {
                if (s.equals(s2)) {
                    num++;
                }
                if (num > 1) {
                    break;
                }
            }
            if (num == 1) {
                stringBuilderOfUniqueWords.append(s).append(" ");
            }
        }
        return stringBuilderOfUniqueWords.toString().trim();
    }

    public List<String> getListOfWords(String text) {
        Pattern pattern = Pattern.compile("(\\s|,|!|\\.)\\s*");
        String[] words = pattern.split(text);
        List<String> textList = new ArrayList<>(List.of(words));
        List<String> wordsList = new ArrayList<>();

        for (String s : textList) {
            if (!wordsList.contains(s)) {
               wordsList.add(s);
            }
        }
        return wordsList;
    }

    public Map<String, Integer> researchText(String text) {
        Map<String, Integer> wordMap = new HashMap<>();
        Pattern pattern = Pattern.compile("(\\s|,|!|\\.)\\s*");
        String[] textList = pattern.split(text);
        Set<String> setText = new HashSet<>(List.of(pattern.split(text)));

        for (String s : setText) {
            int num = 0;
            for (String s2 : textList) {
                if (s2.equals(s)) {
                    num++;
                }
            }
            wordMap.put(s, num);
        }
        return wordMap;
    }

    public Map<String, Integer> getCountUniqueWords(String text) {
        int numberOfUniqueWords = getUniqueWordsFromText(text).split(" ").length;
        Map<String, Integer> uniqueWordsCount = new HashMap<>();

        uniqueWordsCount.put("Unique words count", numberOfUniqueWords);
        return uniqueWordsCount;
    }

    public Map<String, String> getUniqueWords(String text) {
        Map<String, String > uniqueWordsMap = new HashMap<>();
        String uniqueWordsLine = getUniqueWordsFromText(text);

        uniqueWordsMap.put("Unique words", uniqueWordsLine);
        return uniqueWordsMap;
    }

    public int getFrequencyWord(String text) {
        String word = "word";
        int wordsCount = 0;
        String[] textArray = text.split(" ");
        for (String s : textArray) {
            if(s.equals(word)) {
                wordsCount++;
            }
        }
        return wordsCount;
    }

    public Map<String, Integer> getFrequencyWords(boolean isAscendingFrequency, String text) {
        Map<String, Integer> textMap = researchText(text);
        List<Map.Entry<String, Integer>> listTextMap = new ArrayList<>(textMap.entrySet());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        listTextMap.sort(Map.Entry.comparingByValue());
        if (!isAscendingFrequency) {
            listTextMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }

        for (Map.Entry<String, Integer> item : listTextMap){
            sortedMap.put(item.getKey(), item.getValue());
        }
        return sortedMap;
    }

    public Map<Integer, String> getFrequencyWords2(String text) {
        Map<Integer, String> wordsMap = new HashMap<>();
        List<String> wordsList = getListOfWords(text);
        Pattern pattern = Pattern.compile("(\\s|,|!|\\.)\\s*");
        List<String> textList = new ArrayList<>(List.of(pattern.split(text)));

        for (String s : wordsList) {
            int number = 0;
            for (String s2 : textList) {
                if (s.equals(s2)) {
                    number++;
                }
            }
            if (!wordsMap.containsKey(number)) {
                wordsMap.put(number, s);
            } else {
                String lineOfWords = wordsMap.get(number);
                lineOfWords = lineOfWords + " " + s;
                wordsMap.put(number, lineOfWords);
            }
        }
        return wordsMap;
    }
}
