package com.rakovets.course.java.core.practice.strings;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 @Test
 void testGlue(){
 //GIVEN
 StringUtil stringUtil = new StringUtil();

 //WHEN
 String actual = stringUtil.glue("123", "456");

 //THEN
 Assertions.assertEquals("123456", actual);
 }
 */

/**
 static Stream<Arguments> provideArguments1() {
    return Stream.of(
        Arguments.of(),
        Arguments.of(),
        Arguments.of()
          );
      }
 */

public class StringUtilTest {
    StringUtil stringUtil = new StringUtil();

    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("123", "456", "123456"),
                Arguments.of("", "123", "123"),
                Arguments.of("456", "", "456")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void testGlue(String str1, String str2, String expected){

        //WHEN
        String actual = stringUtil.glue(str1, str2);

        //THEN
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArguments1() {
        return Stream.of(
                Arguments.of("abc", "a", 0),
                Arguments.of("a0c", "0", 1),
                Arguments.of("abc", "d", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments1")
    void testIndexOfSymbol (String str, char c, int expected) {
        int actual = stringUtil.indexOfSymbol(str ,c);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTask3() {
        return Stream.of(
                Arguments.of("abc", "abc", true),
                Arguments.of("abc", "aBc", true),
                Arguments.of("A1bC", "a1bc", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask3")
    void testEqualsStrings(String str1, String str2, boolean expected) {
        boolean actual = stringUtil.proveEqualStrings(str1, str2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsTask4() {
        return Stream.of(
                Arguments.of("expectEd ", "EXPECTED"),
                Arguments.of(" expectEd", "EXPECTED"),
                Arguments.of(" expectEd ", "EXPECTED")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask4")
    void testspaceDeleteToUpperCase (String str1, String expected) {
        String str2 = stringUtil.spaceDeleteToUpperCase(str1);
        Assertions.assertEquals(expected, str2);
    }

    static Stream<Arguments> provideArgumentsTask5() {
        return Stream.of(
                Arguments.of(":(", ":)"),
                Arguments.of("asd:(", "asd:)"),
                Arguments.of(":(asd", ":)asd")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask5")
    void testreplaceEmoji(String str1, String expected) {
        String str2 = stringUtil.replaceEmoji(str1);
        Assertions.assertEquals(expected, str2);
    }

    static Stream<Arguments> provideArgumentsTask7() {
        return Stream.of(
                Arguments.of("abc", "abq", false),
                Arguments.of("1b2", "1s2", true),
                Arguments.of("abc", "asb", false)
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsTask7")
    void testWordSearch (String str1, String str2, boolean expected){
        boolean result = stringUtil.wordSearch(str1, str2);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideArgumentsTask8() {
        return Stream.of(
                Arguments.of("e y u i o a", 6),
                Arguments.of("EwrYUzxIOAttt", 6),
                Arguments.of("ota", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask8")
    void testVowelsInString (String str1, int expexted) {
        int quantity = stringUtil.vowelsInString(str1);
        Assertions.assertEquals(expexted, quantity);
    }

    static Stream<Arguments> provideArgumentsTask9() {
        return Stream.of(
                Arguments.of("q.q,q?q!q", 4),
                Arguments.of(".qw..", 3),
                Arguments.of(".,?!", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask9")
    void testNumberOfSigns(String str1, int expected){
        int number = stringUtil.numberOfSigns(str1);
        Assertions.assertEquals(expected, number);
    }

    static Stream<Arguments> provideArgumentsTask10() {
        return Stream.of(
                Arguments.of("dad" , true),
                Arguments.of("deed" , true),
                Arguments.of("dead", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask10")
    void testPalindromeCheck(String str1, boolean expected) {
        boolean result = stringUtil.palindromeCheck(str1);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideArgumentsTask11() {
        return Stream.of(
                Arguments.of("deed", 3, "[dee, d]"),
                Arguments.of("deed", 2, "[de, ed]"),
                Arguments.of("MeeTooSheToo", 3, "[Mee, Too, She, Too]")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask11")
    void testSplitLine(String str1, int num, String expected) {
        String[] result = stringUtil.splitLine(str1, num);
        Assertions.assertEquals(expected, Arrays.toString(result));
    }

    static Stream<Arguments> provideArgumentsTask12() {
        return Stream.of(
                Arguments.of("Dmitry ShAr", "DS"),
                Arguments.of("DmitRY RakOVets", "DR"),
                Arguments.of("dmitry shArshukov", "DS")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTask12")
    void testGetInitials(String str1, String expected) {
        String result = stringUtil.getInitials(str1);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideArgumentsTask13() {
        return Stream.of(
                Arguments.of("A1b23c4", "1234"),
                Arguments.of(),
                Arguments.of()
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsTask13")
    void testGetNumbers(String str, String expected) {
        String result = stringUtil.getNumbers(str);
        Assertions.assertEquals(expected, result);
    }
}
