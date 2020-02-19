//Q8. WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equal to its last character. For the required loop, use a
//a)do-while statement

package com.company;

import java.util.Scanner;

public class Question8b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        do{
            String str = input.next();
            if(str.equals("done"))
                break;
            else{
                if(str.charAt(0) == str.charAt(str.length()-1)){
                    System.out.println("" + str.charAt(0) + str.charAt(str.length()-1));
                    System.out.println("First and Last element are equal.");
                }
            }
        }while (true);

    }

}

