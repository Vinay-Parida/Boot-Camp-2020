//Q1 Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".

package com.example.RestWebService;

import com.example.RestWebService.BeanClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorld {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Welcome to spring boot";
    }

    @GetMapping("/hello-world-bean") //to return as bean
    public BeanClass beanClass(String s) {
        return new BeanClass("Bean Class");
    }

    //Part-2-Q1Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
    @GetMapping("/hello-world-international/{name}")
    public String helloWorldInternationalization(@RequestHeader(name = "Accept-Language", required = false) Locale locale, @PathVariable String name) {
        return messageSource.getMessage("internatinaolization.message", new String []{name}, locale);
    }

    //Part-2-Q2 Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)
    @PostMapping(path = "/hello-user/{username}")
    public String pathClass2(@PathVariable String username) {
        return "Hello " + username;
    }

}



