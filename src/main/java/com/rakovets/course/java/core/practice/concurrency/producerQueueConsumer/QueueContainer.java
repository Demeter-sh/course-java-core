package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class QueueContainer {
    private Queue<Integer> numbers;
    public static final Logger logger = Logger.getLogger(QueueContainer.class.getName());
    int milliseconds = 1000;

    public QueueContainer(Queue<Integer> numbers) {
        this.numbers = numbers;
    }

    public synchronized void putNumbersIntoQueue() {
        int x = 0;
        while (x != -1) {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            numbers.add(x);
        }
    }

    public synchronized void getNumbersOutOfQueue() {
        String numbersOutOfQueue;

        try (FileOutputStream fos = new FileOutputStream("D://notes3.txt", true)) {
            for (int i : numbers) {
                try {
                    int time = i * milliseconds;
                    numbersOutOfQueue = "Time of thread sleep " + time;
                    fos.write(numbersOutOfQueue.getBytes());
                    Thread.sleep(1000L * i);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex){
            logger.warning(ex.getMessage());
        }
    }
}
