// Q9 Write a program to demonstrate the use of CountDownLatch

package com.company;

import java.util.concurrent.CountDownLatch;

class Latch implements Runnable{
    private CountDownLatch latch;
    public Latch( CountDownLatch latch){
        this.latch = latch;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Working");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + " Ended");
    }
}

public class Question9 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latchObj = new CountDownLatch(2);

        Thread t1 = new Thread(new Latch(latchObj));
        Thread t2 = new Thread(new Latch(latchObj));
        Thread t3 = new Thread(new Latch(latchObj));
        Thread t4 = new Thread(new Latch(latchObj));
        Thread t5 = new Thread(new Latch(latchObj));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        latchObj.await();

        System.out.println("Other main statement will run");

    }

}

// Lots of doubts here
