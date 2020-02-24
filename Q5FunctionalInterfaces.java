//Q5 Implement following functional interfaces from java.util.function using lambdas:
//
//        (1) Consumer
//
//        (2) Supplier
//
//        (3) Predicate
//
//        (4) Function

package com.company;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q5FunctionalInterfaces {
    public static void main(String[] args) {

        //Consumer
        Consumer consumer = (e) -> System.out.println( e);
        consumer.accept(5);

        //Function
        Function<Integer, Integer> function = (e) -> {
            return e*2;
        };
        System.out.println(function.apply(4));

        //Predicate
        Predicate<Integer> predicate = e ->{
            return e>6;
        };
        System.out.println(predicate.test(7));

        //Supplier
        Supplier supplier = ()-> {
            return "String";
        };
        System.out.println(supplier.get());




    }
}

