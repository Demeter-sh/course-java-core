package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class Producer implements Runnable {
    private Factory factory;

    public Producer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        factory.produce();
    }
}
