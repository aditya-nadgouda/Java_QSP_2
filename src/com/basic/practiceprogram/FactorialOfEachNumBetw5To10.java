package com.basic.practiceprogram;

public class FactorialOfEachNumBetw5To10 {

    public static void main(String[] args) {
        int n = 5;

        while (n<=10){
            System.out.println("Factorial of "+n+" is : "+factorial(n));
            n++;
        }

    }

    public static int factorial (int n){
        int fact = 1;
        while (n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
}
