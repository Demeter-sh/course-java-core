package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.QueueContainer;

public class ProducerDemo {
    public static void main(String[] args) {
        QueueContainer queueContainer1 = new QueueContainer();
        Thread thread = new Thread(new com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.Producer(queueContainer1));
        thread.start();
    }
}
