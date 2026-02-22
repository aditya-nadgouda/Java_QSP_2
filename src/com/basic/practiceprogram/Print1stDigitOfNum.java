package com.basic.practiceprogram;

public class Print1stDigitOfNum {

    public static void main(String[] args) {

        int num = 1232;
        int last = 0;
        while (num>0){

            last =  num%10;
            num/=10;
        }
        System.out.println("First Digit of Num : "+last);
    }
}
