//Q2 Write a method that takes a string and returns the number of unique characters in the string.

package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Q2UniqueCharacterinString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        char[] ch = str.toLowerCase().toCharArray();
        System.out.println(UniqueCharcter(ch));
    }

    public static int UniqueCharcter(char[] charArray) {
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
        for (Character ch: hashMap.keySet()) {
            if(hashMap.get(ch) == 1)
                count++;
        }
        return count;
    }
}

