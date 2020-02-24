//Q3 Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
// create and apply multiplication method for the functional interface created.

package com.company;

interface Operaton{
    int op(int a, int b);
}

public class Q3InstanceAndStatic {

    int addMethod(int a, int b){
        return  a+b;
    }
    int subtractMethod(int a, int b){
        return  a-b;
    }
    static int multiplyMethod(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Operaton doAdd = new Q3InstanceAndStatic()::addMethod;
        System.out.println("Addition: " + doAdd.op(2,7));

        Operaton doSubtract = new Q3InstanceAndStatic()::subtractMethod;
        System.out.println("Subtraction: " + doSubtract.op(67,23));

        Operaton doMultiply = Q3InstanceAndStatic::multiplyMethod;
        System.out.println("Multiplication: " + doMultiply.op(3,9));

    }
}
