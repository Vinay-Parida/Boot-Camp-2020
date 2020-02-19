//Q8. WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equal to its last character. For the required loop, use a
//a)while statement

package com.company;
import java.util.Scanner;

public class Question8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        while (true){
            String str = input.next();
            if(str.equals("done"))
                break;
            else{
                if(str.charAt(0) == str.charAt(str.length()-1)){
                    System.out.println("First and Last element are equal.");
                }
            }
        }

    }

}
