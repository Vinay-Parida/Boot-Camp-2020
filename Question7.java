// Q7. WAP to convert seconds into days, hours, minutes and seconds.

package com.company;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        System.out.print("Enter seconds: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int day = n/(24 * 3600);
        n %= 24 * 3600;

        int hour = n/(3600);
        n %= 3600;

        int minute = n/60;
        n %= 60;

        System.out.println("Days:" + day + " Hours:" + hour + " Minutes:" + minute + " Seconds:" + n);
    }
}
