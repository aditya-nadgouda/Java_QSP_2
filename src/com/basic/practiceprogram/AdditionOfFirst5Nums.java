package com.basic.practiceprogram;

public class AdditionOfFirst5Nums {

    public static void main(String[] args) {

        int n = 1;

        int sum = 0;
        while (n < 6 ){
            sum = sum+ n;
            n++;
        }

        System.out.println(sum);
    }
}
