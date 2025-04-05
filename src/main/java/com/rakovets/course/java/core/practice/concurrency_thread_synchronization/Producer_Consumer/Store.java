package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Store {
    private int number;
    public static Logger logger = Logger.getLogger(Store.class.getName());

    public Store(int number) {
        this.number = number;
    }

    public synchronized void produce() {
        while (number >= 10) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                logger.log(Level.SEVERE, "Exception", interruptedException);
            }
        }
        number++;
        logger.info("Producer created digit.");
        logger.info("Digit's size " + number + ".");
        notify();
    }

    public synchronized void consume() {
        while (number < 1) {
            try {
                wait();
            } catch (InterruptedException interruptedException) {
                logger.log(Level.SEVERE, "Exception", interruptedException);
            }
        }
        number--;
        logger.info("Consumer has took away digit");
        logger.info("Digit's size " + number + ".");
        notify();
    }
}
