package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueContainer {
    Queue<Integer> numbers = new PriorityQueue<>();

    public Queue<Integer> getNumbers() {
        return numbers;
    }

    synchronized void addNumbersToQueue() {

    }
}
