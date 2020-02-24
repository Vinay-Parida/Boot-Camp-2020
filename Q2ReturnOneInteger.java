//Q2 Create a functional interface whose method takes 2 integers and return one integer.

package com.company;

interface ReturnOneInteger{
    int return1(int a, int b);
}

public class Q2ReturnOneInteger {
    public static void main(String[] args) {
        ReturnOneInteger returnOneInteger = (e1, e2) -> e1;
        System.out.println("One Integer Return: " + returnOneInteger.return1(23,54));
    }
}
