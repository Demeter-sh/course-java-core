package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.Words_monitoring.TestMonitoring;

import java.util.Map;

public class TestMonitoringDemo {
    public static void main(String[] args) {
        TestMonitoring tm = new TestMonitoring();
        String text = "Aba and Preach Aba word";
        // Проверка метода, который выделяет все различные слова и высчитывает частоту их повторения.
        Map<String, Integer> wordMap = tm.researchText(text);
        System.out.println("Research text - \"Aba and Preach Aba word\". Get it's words frequency repetition.");

        for (Map.Entry<String, Integer> item : wordMap.entrySet()) {
            System.out.printf("%s - %d\n", item.getKey(), item.getValue());
        }

        //Проверка метода, который возвращает количество уникальных слов в тексте getCountUniqueWords()
        Map<String, Integer> countUniqueWordsMap = tm.getCountUniqueWords(text);
        System.out.println("\ngetCountUniqueWords() - " + text + "\n");

        for (Map.Entry<String, Integer> item : countUniqueWordsMap.entrySet()) {
            System.out.printf("%s - %d\n", item.getKey(), item.getValue());
        }
        System.out.println();

        //Проверка метода выводящего уникальные слова из текста в строку
        String lineFromGetUniqueWordsFromText = tm.getUniqueWordsFromText(text);
        System.out.println("Method getUniqueWordsFromText - " + lineFromGetUniqueWordsFromText + "\n");

        //Проверка метода getUniqueWords()
        Map<String, String> uniqueWordsMap = tm.getUniqueWords(text);
        for (Map.Entry<String, String> item : uniqueWordsMap.entrySet()) {
            System.out.printf("%s - %s\n", item.getKey(), item.getValue());
        }

        System.out.println("\nWord's frequency " + tm.getFrequencyWord(text));

        //Проверка метода getFrequencyWords(boolean isAscendingFrequency)
        System.out.println("\nПроверка метода getFrequencyWords(boolean isAscendingFrequency)");
        Map<String, Integer> frequencyWordsTrueMap = tm.getFrequencyWords(true, text);
        System.out.println("true");
        for (Map.Entry<String, Integer> item : frequencyWordsTrueMap.entrySet()) {
            System.out.printf("Key - %s, Value - %d\n", item.getKey(), item.getValue());
        }
        Map<String, Integer> frequencyWordsFalseMap = tm.getFrequencyWords(false, text);
        System.out.println("false");
        for (Map.Entry<String, Integer> item : frequencyWordsFalseMap.entrySet()) {
            System.out.printf("Key - %s, Value - %d\n", item.getKey(), item.getValue());
        }
    }
}
