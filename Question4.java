//Q4 Write a program to create a Thread pool of 2 threads where one Thread will print even numbers and other will print odd numbers.

package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 2);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i * 2 - 1);
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        Thread odd = new Thread(new OddThread());

        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.submit(odd);
        pool.submit(even);
    }
}
