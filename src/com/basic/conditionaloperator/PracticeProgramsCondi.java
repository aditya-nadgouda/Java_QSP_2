package com.basic.conditionaloperator;

import java.util.Scanner;

public class PracticeProgramsCondi {

    public static void main(String[] args) {

        // Odd even
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n%2==0 ? "Even" : "odd");

        // Div by 4 and 7
        System.out.println(n%4==0 && n%7==0 ? "Yes":"No");

        // Largest of 5 num
        int a = 10;
        int b = 4;
        int c = 1;
        int d = 0;
        int e = 7;

        int lar  = a > b ? a : b;
        int lar2 = c > lar ? c : lar;
        int lar3 = d > lar2 ? d : lar2;
        int lar4 = e > lar3 ? e : lar3;

        System.out.println("Largest : "+lar4);

        // Check weather the given char is alphabet or not

        char ch = 'Z';

        System.out.println(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z' ? "It's an alphabet" : "Not an alphabet");

    }
}
