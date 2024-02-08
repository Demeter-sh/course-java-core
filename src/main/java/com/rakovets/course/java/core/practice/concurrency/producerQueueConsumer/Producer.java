package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Producer implements Runnable {
    QueueContainer queueContainer;

    public Producer(QueueContainer queueContainer) {
        this.queueContainer = queueContainer;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                if (num == -1) {
                    throw new UserInputException("Don't use -1");
                }
                queueContainer.getNumbers().add(num);
            } catch (UserInputException ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
