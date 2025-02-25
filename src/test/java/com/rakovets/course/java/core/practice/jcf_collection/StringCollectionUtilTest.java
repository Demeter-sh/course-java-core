package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.StringCollectionUtil.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("StringCollectionUtil test")
public class StringCollectionUtilTest {
    StringCollectionUtil scu = new StringCollectionUtil();

    @Test
    @DisplayName("resetWordsByLength")
    void resetWordsByLengthTest() {
        List<String> stringList = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        stringList = scu.resetWordsByLength(stringList, 4);
        List<String> expected = new ArrayList<>(List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"));

        Assertions.assertEquals(expected, stringList);
    }

    @Test
    @DisplayName("resetWordsByLength2")
    void resetWordsByLength2Test() {
        List<String> stringList = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        scu.resetWordsByLength2(stringList, 4);
        List<String> expected = new ArrayList<>(List.of("*", "is", "*", "of", "fun", "for", "every", "*", "programmer"));

        Assertions.assertEquals(expected, stringList);
    }

    @Test
    @DisplayName("removeWordsByLength")
    void removeWordsByLengthTest() {
        List<String> stringList = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        List<String> expectedList = new ArrayList<>(List.of("is","of", "fun", "for", "every", "programmer"));

        stringList = scu.removeWordsByLength(stringList, 4);
        Assertions.assertEquals(expectedList, stringList);
    }

    @Test
    @DisplayName("removeWordsByLength2")
    void removeWordsByLength2Test() {
        List<String> stringList = new ArrayList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        List<String> expectedList = new ArrayList<>(List.of("is","of", "fun", "for", "every", "programmer"));

        scu.removeWordsByLength2(stringList, 4);
        Assertions.assertEquals(expectedList, stringList);
    }
}
