// Q5. WAP to show object cloning in java using cloneable and copy constructor both.
// copy constructor

package com.company;

class CopyConstructor{
    private int a,b;

    public CopyConstructor(int a, int b){
        this.a = a;
        this.b = b;
    }

    CopyConstructor(CopyConstructor c){
        a = c.a;
        b = c.b;
    }

    public void getValues(){
        System.out.println("a: " + a + "; b: " + b);
    }
}

public class Question5b {
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10, 20);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.getValues();
        obj2.getValues();
    }
}
