// Q6 Write a program to demonstrate sleep and join methods.

package com.company;
class Threading implements Runnable {
    @Override
    public void run() {
        System.out.println("Statement 1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Statement 2");
    }
}

public class Question6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Threading());
        t1.start();
        Thread t2 = new Thread(new Threading());
        t2.start();

        t2.join();

        System.out.println("End of program");
    }
}
