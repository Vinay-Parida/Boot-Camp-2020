// Q7 Run a task with the help of callable and store it's result in the Future.

package com.company;

import java.util.concurrent.*;

class Factorial implements Callable<Long> {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial();
    }

    private long factorial() {
        long fact = 1;
        for (int i = 0; i < number; number--) {
            fact = fact * number;
        }
        return fact;
    }
}


public class Question7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        System.out.println("Factorial Service called for 10!");
        Future<Long> result10 = executor.submit(new Factorial(10));

        Long factorial10 = result10.get();
        System.out.println("10! = " + factorial10);

        executor.shutdown();
    }
}
