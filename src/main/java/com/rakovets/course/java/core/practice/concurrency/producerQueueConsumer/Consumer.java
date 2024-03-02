package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Consumer implements Runnable {
    QueueContainer queueContainer;

    public Consumer(QueueContainer queueContainer) {
        this.queueContainer = queueContainer;
    }

    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("Consumer started");
            queueContainer.getNumbersOutOfQueue();
        StandardOutputUtil.printlnWithTime("Consumer ended");
    }
}
