//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value        Parameter (int) Return int
//(3) Concatenation of 2 string                                     Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                    Parameter (String) Return (String)

package com.company;

interface GreaterNumber{
    boolean greaterNumber(int a, int b);
}

interface Increment{
    int incrementing(int n);
}

interface UpperCase{
    String uc(String s);
}

interface Concatinaton{
    String concat(String a, String b);
}

public class Q1FunctionalInterfaceImplementingLambda {
    public static void main(String[] args) {
        GreaterNumber greater=(e1,e2)->e1>e2;
        System.out.println("First number is greater: " + greater.greaterNumber(23,12));

        Increment increment = e -> e+1;
        System.out.println("Value Incremented: " + increment.incrementing(4));

        Concatinaton concat = (e1,e2) -> e1+e2;
        System.out.println("Conacted String: " + concat.concat("Vinay ", "Parida"));

        UpperCase upperCase = e -> e.toUpperCase();
        System.out.println("Uppercaase of String: " + upperCase.uc("java training"));

    }

}
