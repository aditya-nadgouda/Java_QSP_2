package com.basic.practiceprogram;

public class AdditionOfFirstAndLastDigitOfNum {

    public static void main(String[] args) {

        int num = 123;
        int last = num%10;
        int temp =0;

        while (num>0){
            temp = num%10;
            num/=10;
        }

        System.out.println("Addition of First and Last Digit Of Num : "+(temp+last));
    }
}
