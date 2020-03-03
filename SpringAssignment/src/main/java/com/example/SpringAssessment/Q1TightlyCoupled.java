package com.example.SpringAssessment;

class Manager{
    SmartWorker sw;
    LazyWorker lw;

    public Manager(SmartWorker sw, LazyWorker lw){
        this.lw = lw;
        this.sw = sw;
    }

    public void ManageWork(){
        sw.work();
        lw.work();
    }
}

class SmartWorker{
    public void work(){
        System.out.println("Smart Worker");
    }
}

class LazyWorker{
    public void work(){
        System.out.println("Lazy Worker");
    }
}

public class Q1TightlyCoupled {
    public static void main(String[] args) {
        LazyWorker lw = new LazyWorker();
        SmartWorker sw = new SmartWorker();

        Manager manager = new Manager(sw, lw);
        manager.ManageWork();
    }

}
