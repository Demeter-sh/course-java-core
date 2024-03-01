package com.rakovets.course.java.core.practice.concurrency.producerQueueConsumer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class QueueContainer {
    private Queue<Integer> numbers = new PriorityQueue<>();
    public static final Logger logger = Logger.getLogger(QueueContainer.class.getName());


    public synchronized void putNumbersIntoQueue() {
        int x = 0;
        while (x != -1) {
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            numbers.add(x);
        }

    }

    public synchronized void getNumbersOutOfQueue() {
        String numbersOutOfQueue = "";
        try {
            for (int i : numbers) {
                numbersOutOfQueue = numbersOutOfQueue.concat(String.valueOf(i));
            }
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        try(FileOutputStream fos = new FileOutputStream("D://notes3.txt")) {
            fos.write(numbersOutOfQueue.getBytes());
        } catch (IOException ex){
            logger.warning(ex.getMessage());
        }
    }
}
