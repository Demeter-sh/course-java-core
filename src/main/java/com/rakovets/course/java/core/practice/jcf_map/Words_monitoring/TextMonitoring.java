package com.rakovets.course.java.core.practice.jcf_map.Words_monitoring;

import java.util.*;

public class TextMonitoring {
    private Map<String, Integer> map;

    public Map<String, Integer> getMap() {
        return map;
    }

    public void researchText(String text) {
        map = new HashMap<>();
        String[] textToArray = text.toLowerCase().split("\\s");
        for (String word : textToArray) {
            if (!map.containsKey(word)) {
                int wordCount = 0;
                for (int i = 0; i < textToArray.length; i++) {
                    if (word.equals(textToArray[i])) {
                        wordCount++;
                    }
                }
                map.put(word, wordCount);
            }
        }
    }

    public void researchText2(String text) {
        String[] item = text.split(" ");
        map = new HashMap<>();
        for (String word : item) {
            if (map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }
    }

    public int getCountUniqueWords() {
        return map.size();
    }

    public Set<String> getUniqueWords() {
        return map.keySet();
    }

    public int getFrequencyWord(String word) {
        return map.get(word);
    }

    public List<String> getFrequencyWords(boolean isAscendingFrequency) {
        List list = new ArrayList<>(map.entrySet());
        if (isAscendingFrequency) {
            list.sort(Map.Entry.comparingByValue());
        } else {
            list.sort(Map.Entry.comparingByValue().reversed());
        }
        return list;
    }
}
