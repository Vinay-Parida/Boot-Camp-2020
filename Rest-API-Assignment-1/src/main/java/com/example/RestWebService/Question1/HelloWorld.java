//Q1 Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".

package com.example.RestWebService.Question1;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Welcome to spring boot";
    }

    @GetMapping("/hello-world-bean") //to return as bean
    public BeanClass beanClass(String s){
        return new BeanClass("Bean Class");
    }

    @GetMapping(path = "/hello-world/{name}")
    public BeanClass pathClass(@PathVariable String name){
        return new BeanClass(String.format("%s is URI Name that is fetched", name));
    }



    @PostMapping(path = "/hello-world/day/{name}")
    public BeanClass pathClass2(@RequestBody String name){
        return new BeanClass(String.format("%s is URI Name that is fetched", name));
    }

    @GetMapping("/hello-world-international")
    public String helloWorldInternationalization() {
        return "Hello in different language";
    }
}



