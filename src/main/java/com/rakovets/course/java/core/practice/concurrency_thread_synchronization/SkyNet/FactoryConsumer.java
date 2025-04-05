package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

import java.util.HashMap;
import java.util.Map;

public class FactoryConsumer implements Runnable {
    String name;
    private Factory factory;
    Map<String, Integer> mapOfConsumedDetails;

    public FactoryConsumer(String name, Factory factory) {
        this.name = name;
        this.factory = factory;
        mapOfConsumedDetails = new HashMap<>();
    }

    @Override
    public void run() {
        factory.consume();
        mapOfConsumedDetails.putAll(factory.removeDetails());
    }
}
