//Q2 Write a program to create a thread using Thread class and Runnable interface each.

package com.company;

class ThreadUsingThreadClass extends Thread {
   public void run() {
       for (int i = 0; i < 10; i++) {
           System.out.println("This thread is created by Thread class");
       }
   }
}


class ThreadUsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This thread is created by Runnable interface");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        ThreadUsingThreadClass threadObject = new ThreadUsingThreadClass();

        ThreadUsingRunnableInterface runnableObject = new ThreadUsingRunnableInterface();
        Thread t = new Thread(runnableObject);

        threadObject.start();
        t.start();
    }
}
