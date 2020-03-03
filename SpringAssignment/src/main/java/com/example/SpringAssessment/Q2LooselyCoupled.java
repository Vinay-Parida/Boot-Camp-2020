package com.example.SpringAssessment;

class Manager1 {
    Worker wkr;

    public Manager1(Worker wkr) {
        this.wkr = wkr;
    }

    public void ManageWork() {
        wkr.work();
    }
}

interface Worker {
    void work();
}

class SmartWorker1 implements Worker {
    public void work() {
        System.out.println("Smart Worker");
    }
}

class LazyWorker1 implements Worker {
    public void work() {
        System.out.println("Lazy Worker");
    }
}


public class Q2LooselyCoupled {
    public static void main(String[] args) {
        Manager1 manager1 = new Manager1(new SmartWorker1());
        manager1.ManageWork();

        Manager1 manager2 = new Manager1(new LazyWorker1());
        manager2.ManageWork();
    }
}
