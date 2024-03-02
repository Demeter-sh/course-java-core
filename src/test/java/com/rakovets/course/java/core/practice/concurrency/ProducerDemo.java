package com.rakovets.course.java.core.practice.concurrency;

import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.Consumer;
import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.Producer;
import com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer.QueueContainer;

import java.util.PriorityQueue;

public class ProducerDemo {
    public static void main(String[] args) {
        /*
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        QueueContainer queueContainer = new QueueContainer(queue);
        Consumer consumer = new Consumer(queueContainer);
        new Thread(consumer).start();
        */
        QueueContainer queueContainer = new QueueContainer(new PriorityQueue<>());
        Producer producer = new Producer(queueContainer);
        Consumer consumer = new Consumer(queueContainer);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
