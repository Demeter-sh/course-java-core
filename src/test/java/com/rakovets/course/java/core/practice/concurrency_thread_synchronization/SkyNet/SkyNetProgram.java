package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.SkyNet;

public class SkyNetProgram {
    public static void main(String[] args) {
        Factory factory = new Factory();
        FactoryConsumer factoryConsumer = new FactoryConsumer("Factory Consumer", factory);
        Thread factoryConsumerThread = new Thread(factoryConsumer);
        new FactoryProducer("Factory producer", factory).start();
        factoryConsumerThread.start();
    }
}
