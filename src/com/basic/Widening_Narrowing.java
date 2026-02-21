package com.basic;

public class Widening_Narrowing {

    public static void main(String[] args) {

        // Widening

        int a = 10 ;
        long l = a;
        System.out.println(l);// long

        char c = 'g';
        int g = c;
        System.out.println(g); // int

        // Narrowing

        int i = 99;

        char ch = (char) i;

        System.out.println(ch);// int to char - explicitly

        long ll = 100000l;

        int v = (int) ll;

        System.out.println(v); // long to int

    }
}
