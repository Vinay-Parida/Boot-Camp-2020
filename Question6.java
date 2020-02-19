// Q6 WAP showing try, multi-catch and finally blocks.

package com.company;

public class Question6 {
    public static void main(String[] args) {
        int[] b = {1,2,3,4,5};
        try{
            b[5] = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot be divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array element is out of index");
        }
        finally {
            System.out.println("Finally will always execute");
        }
    }
}
