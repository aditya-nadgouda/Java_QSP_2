package com.basic.functions.recursion;

public class AlphabetPrint {
    public static char printAlphabet ( char c ){
        System.out.print(c++ + " ");
        if (c <= 'z'){
            printAlphabet(c);
        }
        return 0;
    }
    public static void main(String[] args) {
        printAlphabet('a');
    }
}
