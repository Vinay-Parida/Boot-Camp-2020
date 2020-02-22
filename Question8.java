// Q8 Write a program to demonstrate the use of semaphore.

package com.company;

import java.util.concurrent.Semaphore;

class SemaphoreClass implements Runnable {
    Semaphore sem;
    String str;

    public SemaphoreClass(Semaphore sem, String str) {
        this.sem = sem;
        this.str = str;
    }

    @Override
    public void run() {
        System.out.println(str + " Thread started");

        try {
            System.out.println(str + " Thread is waiting for permit");
            sem.acquire();
            System.out.println(str + " Gets the permits");

            for (int i = 0; i < 2; i++) {
                System.out.println(str + " uses the resource");
            }
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str + " Releases the permit");
        sem.release();

    }

}
public class Question8 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore sem = new Semaphore(2);

        Thread t1 = new Thread(new SemaphoreClass(sem, "A"));
        Thread t2 = new Thread(new SemaphoreClass(sem, "B"));
        Thread t3 = new Thread(new SemaphoreClass(sem, "C"));

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();


    }
}
