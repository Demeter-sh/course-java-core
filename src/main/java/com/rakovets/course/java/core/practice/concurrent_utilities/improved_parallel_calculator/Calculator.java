package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Calculator {
    public final static Logger logger = Logger.getLogger(Calculator.class.getName());
    private Map<Integer, int[]> mapOfSumAndArrayNumbers;
    ReentrantLock lock;
    String name;

    public Calculator(String name) {
        mapOfSumAndArrayNumbers = new HashMap<>();
        lock = new ReentrantLock();
        this.name = name;
    }
    public void getSumOfNumbers(List<int[]> listOfIntegerOfArrays) {
        for (int[] intArray : listOfIntegerOfArrays) {
            int sum = 0;
            for (int i : intArray) {
                sum += i;
            }
            mapOfSumAndArrayNumbers.put(sum, intArray);
        }
    }

    public Map<Integer, int[]> getMapOfSumOfArrayNumbers() {
        return mapOfSumAndArrayNumbers;
    }

    public void getMapOfSumOfArrayNumbersThreads(List<int[]> list,int countOfThreads) {
        List<int[]> listCopy = Collections.synchronizedList(list);
        long startTime = System.currentTimeMillis();
        ExecutorService execute = Executors.newFixedThreadPool(countOfThreads);

        Runnable calculatorWithThread = () -> {
            lock.lock();
            if (!listCopy.isEmpty()) {
                int[] array = listCopy.remove(0);
                lock.unlock();
                int sum = 0;
                for (int number : array) {
                    sum += number;
                }
                mapOfSumAndArrayNumbers.put(sum, array);
            } else {
                lock.unlock();
            }
            logger.info("Thread " + countOfThreads + " - " + (System.currentTimeMillis() - startTime));
        };

        for (int i = 0; i < countOfThreads; i++) {
        execute.execute(calculatorWithThread);
        }
        execute.shutdown();
    }
}
