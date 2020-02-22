// Q10 Write a program which creates deadlock between 2 threads.

package com.company;

public class Question10 {
    public static void main(String[] args) {
        final Integer resourse1 = 1;
        final Integer resourse2 = 2;

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resourse1) {
                    System.out.println("Thread 1 locked resource 1");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resourse2) {
                        System.out.println("Thread 1 locked resource 2 ");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resourse2) {
                    System.out.println("Thread 2 locked resource 2");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resourse1) {
                        System.out.println("Thread 2 locked resource 1");
                    }
                }

            }
        };

        t1.start();
        t2.start();


    }
}
