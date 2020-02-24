package com.company;

interface InterfaceOne{
    default void methodOne(){
        System.out.println("First Inheritance");
    }
}

interface InterfaceTwo{
    default void methodTwo(){
        System.out.println("Second Inheritance");
    }
}

public class Q8MultipleInheritance implements InterfaceOne, InterfaceTwo{
    public static void main(String[] args) {
        InterfaceOne objectOne = new InterfaceOne() {
            @Override
            public void methodOne() {
                System.out.println("Override first method");
            }
        };
        InterfaceTwo objectTwo = new InterfaceTwo() {
            @Override
            public void methodTwo() {
                System.out.println("Override second method");

            }
        };

        objectOne.methodOne();
        objectTwo.methodTwo();
    }
}
