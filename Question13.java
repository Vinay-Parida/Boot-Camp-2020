package com.company;

import java.util.Scanner;

class ZeroCustomException extends Exception{
    ZeroCustomException(String message){
        super(message);
    }
}

public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int value = input.nextInt();
            if(value == 0){
                throw new ZeroCustomException("Zero is now valid here");
            }
        } catch (ZeroCustomException e) {
            e.printStackTrace();
        }
    }
}
