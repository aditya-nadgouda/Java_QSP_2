package com.basic.functions;

public class ParameterizedMethod {

    public static void test (int a){
        System.out.println("int method");
    }

    public static void test (double a){
        System.out.println("Double Method");
    }

    public static void test (char c){
        System.out.println("Char method");
    }

    public static void main(String[] args) {
        test(10f);
    }
}
