package com.example.SpringAssessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Drink {
    void getDrinkName();
}

@Component
class Tea implements Drink {
    @Override
    public void getDrinkName() {
        System.out.println("Tea");
    }
}

@Component
@Primary
class Coffee implements Drink {
    @Override
    public void getDrinkName() {
        System.out.println("Coffee");
    }
}

@Component
class Barista{
    @Autowired
    Drink s;
    public Barista(Drink s){
        this.s = s;
    }
    public void getDrink(){
        s.getDrinkName();
    }
}//This is also Constructor Injection

@SpringBootApplication
public class Q5PrimaryAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Q5PrimaryAnnotation.class);
        Barista barista = applicationContext.getBean(Barista.class);
        barista.getDrink();
    }

}
