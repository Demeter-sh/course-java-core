package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Consumer;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Factory;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.Producer;

public class SkynetDemo {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Thread producer = new Thread(new Producer(factory));
        Thread consumer = new Thread(new Consumer(factory));
        producer.start();
        consumer.start();
    }
}
