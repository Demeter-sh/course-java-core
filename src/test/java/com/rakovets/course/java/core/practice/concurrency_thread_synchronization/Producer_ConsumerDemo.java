package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ProducerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.Store;

public class Producer_ConsumerDemo {
    public static void main(String[] args) {
        Store store = new Store(0);
        ProducerThread producerThread = new ProducerThread("Producer", store);
        Thread consumerThread = new Thread(new ConsumerThread(store), "consumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
