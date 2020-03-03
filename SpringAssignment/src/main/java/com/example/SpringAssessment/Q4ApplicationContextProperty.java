package com.example.SpringAssessment;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Q4ApplicationContextProperty {
    public static void main(String[] args) {
       ApplicationContext applicationContext = SpringApplication.run(Q4ApplicationContextProperty.class);

        for (String i: applicationContext.getBeanDefinitionNames()) {
            System.out.println(i);
        }
    }
}
