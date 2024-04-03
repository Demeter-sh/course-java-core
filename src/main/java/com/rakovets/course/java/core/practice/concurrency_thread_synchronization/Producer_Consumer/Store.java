package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

import java.util.Arrays;
import java.util.logging.Logger;

public class Store {
    private final static Logger logger = Logger.getLogger(Store.class.getName());
    private int[] intArrays = new int[10];
    private int[] emptyIntArrays = new int[10];
    private int number;

    public Store(int number) {
        this.number = number;
    }

    public synchronized void produce() {
        while (!Arrays.equals(intArrays, emptyIntArrays)) {
            try {
                wait();
            } catch (InterruptedException interruptedEx) {
                logger.warning(interruptedEx.getMessage());
            }
        }

        Arrays.fill(intArrays, number);
        notify();
    }

    public synchronized void consume() {
        while (Arrays.equals(intArrays, emptyIntArrays)) {
            try {
                wait();
            } catch (InterruptedException interruptedEx) {
                logger.warning(interruptedEx.getMessage());
            }
        }

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(intArrays[i]);
            intArrays[i] = 0;
        }
    }
}
