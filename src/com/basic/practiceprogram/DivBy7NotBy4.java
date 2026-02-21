package com.basic.practiceprogram;

import java.util.Scanner;

public class DivBy7NotBy4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n%7==0 && n%4!=0 ? "yes":"no");
    }
}
