package com.basic.practiceprogram;

public class PrintFirstAndLastDigitOfNum {


    public static void main(String[] args) {

        int num = 1232;
        int last = 0;
        System.out.println("Last Digit : "+num%10);

        while (num>0){
            last = num%10;
            num/=10;
        }

        System.out.println("First Digit : "+last);
    }
}
