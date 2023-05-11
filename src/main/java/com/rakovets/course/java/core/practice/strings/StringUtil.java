package com.rakovets.course.java.core.practice.strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    String glue( String str1, String str2){
        return str1.concat(str2);
    }

    int indexOfSymbol (String str, char c) {
        int i = str.indexOf(c);
        return i;
    }

    boolean proveEqualStrings(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }

    String spaceDeleteToUpperCase (String str1) {
        String str2 = str1.toUpperCase().trim();
        return str2;
    }

    String replaceEmoji (String str1) {
        String str2 = str1.replace(":(", ":)");
        return  str2;
    }

    boolean wordSearch(String str1, String str2) {
        int lastWord1 = str1.length() - 1;
        int lastWord2 = str2.length() - 1;
        boolean resultFirst = str1.regionMatches(true, 0, str2, 0, 1);
        boolean resultLast =  str1.regionMatches(true, lastWord1, str2, lastWord2, 1);
        boolean result = true;
        if (resultFirst != resultLast) {
            result = false;
        }
        return result;
    }

    int vowelsInString(String str1){
        int quantityOfvowels = 0;
        String[] arrayStr = str1.split("");
        for (String s : arrayStr) {
            if (s.matches("[eyuioa[EYUIOA]]")) {
            quantityOfvowels++;
            }
        }
        return quantityOfvowels;
    }

    int numberOfSigns(String str1) {
        int quantity = 0;
        String[] str2 = str1.split("");
        for (String s : str2) {
            if (s.matches("[.,?!]")) {
                quantity++;
            }
        }
        return  quantity;
    }

    boolean palindromeCheck(String str1) {
        String[] arrayStr1 = str1.split("");
        String[] arrayStr2 = new String[arrayStr1.length];
        int lettersInStr1 = str1.length() - 1;
        int j = 0;
        for (int i = lettersInStr1; i >= 0; i--){
            arrayStr2[j] = arrayStr1[i];
            if (j < lettersInStr1) {
                j ++;
            }
        }
        StringBuilder str2 = new StringBuilder();
        for (String s : arrayStr2) {
            str2.append(s);
        }
        boolean palindromeTrue = false;
        if (str2.toString().equals(str1)) {
            palindromeTrue = true;
        }
        return palindromeTrue;
    }

    String[] splitLine (String str1, int n) {
        str1 = str1.replace(" ", "");
        StringBuilder str2 = new StringBuilder();
        int j = n;
        for(int i = 0; i < str1.length(); i++) {
            str2.append(str1.charAt(i));
            j--;
            if (j == 0) {
                str2.append(" ");
                j = n;
            }
        }
        String[] str2Array = str2.toString().split(" ");
        return str2Array;
    }

    String getInitials(String str) {
        String[] strArray = str.split(" ");
        String str2 = String.valueOf(strArray[0].charAt(0)) + strArray[1].charAt(0);
        str2 = str2.toUpperCase();
        return str2;
    }

    String getNumbers(String str1) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str1);
        String str2 = "";
        while (matcher.find()){
            str2 += matcher.group();
        }
        return str2;
    }
}
