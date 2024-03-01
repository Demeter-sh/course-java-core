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

/*
        QueueContainer queueContainer0 = new QueueContainer();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                if (num == -1) {
                    throw new UserInputException("Don't use -1");
                }
                queueContainer0.getNumbers().add(num);
            } catch (UserInputException ex) {
                logger.warning(ex.getMessage());
            } catch (InputMismatchException ex) {
                logger.warning(ex.getMessage());
            }
        }
         */
