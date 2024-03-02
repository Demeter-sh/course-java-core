package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import java.io.FileWriter;
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
        Scanner sc = new Scanner(System.in);
        int x;
        while ((x = sc.nextInt()) != -1) {
            numbers.add(x);
        }
    }

    public synchronized void getNumbersOutOfQueue() {
        String numbersOutOfQueue;
        try (FileWriter fos = new FileWriter("D://notes3.txt", false)) {
            for (int i : numbers) {
                try {
                    int time = i * milliseconds;
                    numbersOutOfQueue = "Time of thread sleep " + time +"\n";
                    fos.write(numbersOutOfQueue);
                    fos.flush();
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
