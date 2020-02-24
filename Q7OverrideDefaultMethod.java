//Q7  Override the default method of the interface.

package com.company;

interface OverrideMethod {
    default void defaultMethod() {
        System.out.println("Default Method");
    }
}

public class Q7OverrideDefaultMethod {
    public static void main(String[] args) {
        OverrideMethod object = new OverrideMethod() {
            @Override
            public void defaultMethod() {
                System.out.println("This is an override println");
            }
        };

        object.defaultMethod();
    }
}

