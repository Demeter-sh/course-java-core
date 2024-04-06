package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

public class Consumer implements Runnable {
    private Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        factory.removeDetails();
    }
}
