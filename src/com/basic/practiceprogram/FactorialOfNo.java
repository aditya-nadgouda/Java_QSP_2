package com.basic.practiceprogram;

public class FactorialOfNo {

    public static void main(String[] args) {

        int n = 7;
        int fact = 1;
        while (n > 0){
            fact = fact*n;

            n--;

        }

        System.out.println(fact);
    }
}
