//Q1  Write a program do to demonstrate the use of volatile keyword.

package com.company;
import java.util.Scanner;

class VolatileImplemenatation extends Thread{

    private volatile boolean running = true;

    @Override
    public void run() {
        while(running){
            System.out.println("Thread is running");
        }
    }
    public void terminate(){
        running = false;
    }
}

class Question1{
    public static void main(String[] args) {
        VolatileImplemenatation object = new VolatileImplemenatation();
        object.start();
         Scanner input = new Scanner(System.in);
         input.nextLine();

         object.terminate();
    }
}