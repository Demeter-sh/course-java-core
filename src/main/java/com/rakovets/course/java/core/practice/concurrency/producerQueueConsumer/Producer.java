package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import com.rakovets.course.java.core.util.StandardOutputUtil;

public class Producer implements Runnable {
    QueueContainer queueContainer;

    public Producer(QueueContainer queueContainer) {
        this.queueContainer = queueContainer;
    }

    @Override
    public void run() {
        StandardOutputUtil.printlnWithTime("Started");
            queueContainer.putNumbersIntoQueue();
    }
}
