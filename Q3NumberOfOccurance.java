//Q3 Write a method that takes a string and print the number of occurrence of each character characters in the string.

package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Q3NumberOfOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        char[] ch = str.toLowerCase().toCharArray();
        NumberOfOccurance(ch);
    }

    public static void NumberOfOccurance(char[] charArray) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (Character ch: charArray) {
            if(hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch) + 1);
            }
            else{
                hashMap.put(ch, 1);
            }
        }
        System.out.println(hashMap);
    }
}
