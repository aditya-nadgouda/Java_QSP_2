package com.basic.practiceprogram;

import java.util.Scanner;

public class CheckLastAndFirstDigitOfNumEvenOrOdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int last = num%10;

        int first =0;
        while (num > 0) {
            first = num%10;
            num/=10;
        }

        System.out.println("Last Num is "+last+ (last%2==0 ? " = Even":" = Odd"));
        System.out.println("First Num is "+first+ (first%2==0 ? " = Even":" = Odd"));

    }
}
