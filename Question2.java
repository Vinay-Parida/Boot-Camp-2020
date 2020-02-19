// Q2. WAP to sorting string without using string Methods?.

package com.company;

public class Question2 {
    public static void main(String[] args) {
        String str = "JavaTraining";
        char string[] = str.toCharArray();
        char temp;
        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (Character.toLowerCase(string[j]) > Character.toLowerCase(string[i])) {
                    temp = string[j];
                    string[j] = string[i];
                    string[i] = temp;
                }
            }
        }
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
        }
    }
}
