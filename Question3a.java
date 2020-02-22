// Q3 rite a program using synchronization block and synchronization method
// a) Synchronization method

package com.company;

class ThreadImplemantaion implements Runnable {
    Question3 ob;

    ThreadImplemantaion(Question3 ob) {
        this.ob = ob;
    }

    public void run() {
        for (int j = 0; j < 5000; j++) {
            ob.incrementWithoutSync();
            ob.incrementWithSync();
        }
    }
}

class Thread2 extends Thread {
    Question3 ob;

    Thread2(Question3 ob) {
        this.ob = ob;
    }

    public void run() {
        for (int j = 0; j < 5000; j++) {
            ob.incrementWithoutSync();
            ob.incrementWithSync();
        }
    }
}

class Question3 {
    int i = 0;
    int k = 0;

    public void incrementWithoutSync() {
        i++;
    }

    public synchronized void incrementWithSync() {
        k++;
    }

    public static void main(String[] args) throws InterruptedException {
        Question3 ob = new Question3();
        Thread t1 = new Thread(new ThreadImplemantaion(ob));
        Thread2 t2 = new Thread2(ob);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Without Sync count: " + ob.i + " With Sync count: " + ob.k);
    }
}

