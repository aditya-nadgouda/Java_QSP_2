package com.basic.practiceprogram;

public class EvenNosFromOneToTen {

    public static void main(String[] args) {
        int n = 10;

        while (n>0){
            if (n%2==0){
                System.out.println(n);
            }
            n--;
        }
    }
}
