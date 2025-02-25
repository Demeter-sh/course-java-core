package com.rakovets.course.java.core.practice.jcf_collection.StringCollectionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {

    public List<String> resetWordsByLength(List<String> list, int wordLength) {
        List<String> newList = new ArrayList<>(list.size());
        for(String string : list) {
            if(string.length() == wordLength) {
                newList.add("*");
            } else newList.add(string);
        }
        return newList;
    }

    public void resetWordsByLength2(List<String> list, int wordLength) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.set("*");
            }
        }
    }

    public List<String> removeWordsByLength(List<String> list, int wordLength) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.length() < wordLength || s.length() > wordLength) {
                newList.add(s);
            }
        }
        return newList;
    }
    public void removeWordsByLength2(List<String> list, int wordLength) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == wordLength) {
                listIterator.remove();
            }
        }
    }
}
