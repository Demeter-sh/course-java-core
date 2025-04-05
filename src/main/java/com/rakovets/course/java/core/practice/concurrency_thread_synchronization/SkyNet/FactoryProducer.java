package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

public class FactoryProducer extends Thread {
    private Factory factory;

    public FactoryProducer(String name, Factory factory) {
        super(name);
        this.factory = factory;
    }

    @Override
    public void run() {
        factory.produce();
    }
}
