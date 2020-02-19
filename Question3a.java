//Q3  WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

package com.company;

public class Question3a {
    public static void main(String[] args) {
        NoDefClass obj = new NoDefClass();
    }
}
class NoDefClass{
}
// This NoClassDefFoundError occurs when we have a class file at compile time but not at run time

