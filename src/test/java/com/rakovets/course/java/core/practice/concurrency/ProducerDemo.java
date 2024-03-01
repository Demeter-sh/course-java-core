package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.Producer;
import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.QueueContainer;

public class ProducerDemo {
    public static void main(String[] args) {
        QueueContainer queueContainer = new QueueContainer();
        Producer producer = new Producer(queueContainer);
        Consumer consumer = new Consumer(queueContainer);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
