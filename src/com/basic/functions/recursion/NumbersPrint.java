package com.basic.functions.recursion;

public class NumbersPrint {
    public static int printNum (int n){
        System.out.println(n++);
        if (n < 11){
            printNum(n);
        }
        return 0;
    }

    public static void main(String[] args) {
        printNum(1);
    }

}
