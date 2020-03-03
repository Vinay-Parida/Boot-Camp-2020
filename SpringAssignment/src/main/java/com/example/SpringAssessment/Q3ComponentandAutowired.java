package com.example.SpringAssessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface WorkerInterface{
    void work();
}

@Component
class Manager2{
    @Autowired
    WorkerInterface wkr;

    public Manager2(WorkerInterface wkr){
        this.wkr = wkr;
    }

    public void ManageWork(){
        wkr.work();
    }
}

class SmartWorker2 implements WorkerInterface{
    public void work(){
        System.out.println("Smart Worker");
    }
}

@Component
class LazyWorker2 implements WorkerInterface{
    public void work(){
        System.out.println("Lazy Worker");
    }
}

@SpringBootApplication
public class Q3ComponentandAutowired {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Q3ComponentandAutowired.class, args);
        Manager2 manager2 = applicationContext.getBean(Manager2.class);
        System.out.println(manager2);
        manager2.ManageWork();

    }
}