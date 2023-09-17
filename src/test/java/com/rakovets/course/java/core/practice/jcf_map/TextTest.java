package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.Words_monitoring.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

public class TextTest {
    TextMonitoring textMonitoring = new TextMonitoring();
    String text = "Java, java, java, code, Code, program";

    static Stream<Arguments> provideArgumentsForResearchText() {
        Map<String, Integer> map = new HashMap<>();
        map.put("java,", 3);
        map.put("code,", 2);
        map.put("program", 1);
        return Stream.of(Arguments.of(map
        ));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForResearchText")
    void researchText(Map<String, Integer> expected) {
        textMonitoring.researchText(text);
        Assertions.assertEquals(expected, textMonitoring.getMap());
    }

    static  Stream<Arguments> provideArgumentsForGetCountUniqueWords() {
        return Stream.of(Arguments.of(new Integer(3)));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForGetCountUniqueWords")
    void getCountUniqueWordsTest(Integer expected) {
        textMonitoring.researchText(text);
        Assertions.assertEquals(expected, textMonitoring.getCountUniqueWords());
    }

    static Stream<Arguments> provideArgumentsForGetUniqueWords() {
        Set<String> list = new HashSet<>(Set.of("java,", "code,", "program"));
        return Stream.of(Arguments.of(list));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForGetUniqueWords")
    void getUniqueWordsTest(Collection<String> expected) {
        textMonitoring.researchText(text);

        Set<String> actual = textMonitoring.getUniqueWords();
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWord() {
        return Stream.of(Arguments.of(3));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForGetFrequencyWord")
    void getUniqueWords(int expected) {
        textMonitoring.researchText(text);
        int actual = textMonitoring.getFrequencyWord("java,");

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWordsIsAscending() {
        Map<String, Integer> wordsMap = new HashMap<>();
        wordsMap.put("java,", 3);
        wordsMap.put("code,", 2);
        wordsMap.put("program",1);
        List wordsList = new ArrayList<>(wordsMap.entrySet());
        wordsList.sort(Map.Entry.comparingByValue());
        return Stream.of(Arguments.of(wordsList));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForGetFrequencyWordsIsAscending")
    void getFrequencyWordsIsAscendingTest(List<String> expected) {
        textMonitoring.researchText(text);

        Assertions.assertEquals(expected, textMonitoring.getFrequencyWords(true));
    }

    static Stream<Arguments> provideArgumentsForGetFrequencyWordsIsDescending() {
        Map<String, Integer> wordsMap = new HashMap<>();
        wordsMap.put("java,", 3);
        wordsMap.put("code,", 2);
        wordsMap.put("program",1);
        List wordsList = new ArrayList<>(wordsMap.entrySet());
        wordsList.sort(Map.Entry.comparingByValue().reversed());
        return Stream.of(Arguments.of(wordsList));
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideArgumentsForGetFrequencyWordsIsDescending")
    void GetFrequencyWordsIsDescendingTest(List<String> expected) {
        textMonitoring.researchText(text);

        Assertions.assertEquals(expected, textMonitoring.getFrequencyWords(false));
    }
}
