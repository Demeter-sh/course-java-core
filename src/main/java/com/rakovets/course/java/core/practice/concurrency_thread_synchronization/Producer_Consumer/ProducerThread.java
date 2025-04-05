package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

public class ProducerThread extends Thread {
    private Store store;

    public ProducerThread(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void run() {
        for (int n = 0; n < 5; n++) {
            store.produce();
        }
    }
}
