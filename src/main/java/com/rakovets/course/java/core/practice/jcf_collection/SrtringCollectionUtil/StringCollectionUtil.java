package com.rakovets.course.java.core.practice.jcf_collection.SrtringCollectionUtil;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public List<String> resetWordsByLength(List<String> list1, int num) {
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            String line = listIterator.next();
            if (line.length() == num) {
                listIterator.set("*");
            }
        }
        return list1;
    }

    public List<String> removeWordsByLength(List<String> list1, int num) {
        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            String line = listIterator.next();
            if (line.length() == num) {
                listIterator.remove();
            }
        }
        return list1;
    }
}
