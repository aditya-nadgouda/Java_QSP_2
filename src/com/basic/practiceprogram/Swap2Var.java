package com.basic.practiceprogram;

public class Swap2Var {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';

        char temp = c1;
        c1=c2;
        c2 = temp;

        System.out.println(c1);
        System.out.println(c2);
    }
}
