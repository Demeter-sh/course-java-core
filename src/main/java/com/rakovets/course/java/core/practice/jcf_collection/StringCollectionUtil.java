package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.*;

public class StringCollectionUtil {

    public List<String> makeList() {
        List<String> list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");
        return list;
    }

    public List<String> resetWordsByLength(List<String> list, int num) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String line = iterator.next();
            if(line.length() == num) {
                iterator.set("*");
        }
    }
    return list;
}

    public void removeWordsByLength(List<String> list, int num) {
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            if(listIterator.next().length() == num) {
                listIterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        StringCollectionUtil smth = new StringCollectionUtil();
        List<String> list = smth.makeList();
        smth.removeWordsByLength(list, 2);
        Iterator<String> iterator = list.listIterator();
        System.out.println(iterator);
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
