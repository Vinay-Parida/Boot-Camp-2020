// Q5. WAP to show object cloning in java using cloneable and copy constructor both.
// clone()

package com.company;

class CloneClass1 implements Cloneable{
    int a,b;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Question5a {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneClass1 obj1 = new CloneClass1();
        obj1.a = 10;
        obj1.b = 20;

        CloneClass1 obj2 = (CloneClass1)obj1.clone();

        obj2.a = 5;

        System.out.println("Main Class variable a: "+ obj1.a + " b: " + obj1.b);
        System.out.println("Clone Class variable a: "+ obj2.a + " b: " + obj2.b);
    }
}
