// Q5 Write a program to demonstrate wait and notify methods.

package com.company;

import java.util.Scanner;

class Operation {
    public void methodOne() throws InterruptedException {
        synchronized (this) {
            System.out.println("Thread is started");
            wait();
            System.out.println("First Method completed");
        }
    }
    public void methodTwo() throws InterruptedException {
        synchronized (this){
            System.out.println("After wait the thread goes to second method");
            notify();
            System.out.println("After notify thread will go back to wait but wait will start again only when this block ends");
        }

    }
}


public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        Operation object = new Operation();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    object.methodOne();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    object.methodTwo();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();



    }
}
