package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

public class ConsumerThread implements Runnable{
    Store store;

    public ConsumerThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.consume();
    }
}
