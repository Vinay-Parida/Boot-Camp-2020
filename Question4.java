// Q4. WAP to create singleton class.

package com.company;

class Singleton{
    private static  Singleton singletonObject;
    public String str;
    private Singleton(){
        str = "This is Singleton";
    }
    public static Singleton getValue(){
        singletonObject = new Singleton();
        return  singletonObject;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Singleton a = Singleton.getValue();
        System.out.println(a.str);
    }

}
