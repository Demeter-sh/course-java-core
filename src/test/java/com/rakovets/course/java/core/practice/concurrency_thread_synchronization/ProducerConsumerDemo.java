package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.Store;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store(5);
        Thread consumerThread = new Thread(new ConsumerThread(store));
        Thread producerThread = new Thread(new ProducerThread(store));
        producerThread.start();
        consumerThread.start();
    }
}
