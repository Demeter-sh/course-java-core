package com.rakovets.course.java.core.practice.jcf_map;

import com.rakovets.course.java.core.practice.jcf_map.Words_monitoring.TextMonitoring;

import java.util.Map;

public class TextDemo {
    public static void main(String[] args) {
        TextMonitoring textMonitoring = new TextMonitoring();
        String text = "Java, java, java, code, Code, program";
        textMonitoring.researchText(text);

        for (Map.Entry<String, Integer> mp : textMonitoring.getMap().entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

        System.out.println(textMonitoring.getUniqueWords());
    }
}
