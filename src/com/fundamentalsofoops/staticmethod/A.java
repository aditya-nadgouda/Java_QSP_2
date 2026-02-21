package com.fundamentalsofoops.staticmethod;

public class A {

    static String city = "India";


    public static void main(String[] args) {

        String city = "Maharashtra";

        System.out.println("Local Var : "+ city);
        System.out.println("Static/Global Var : "+ A.city);

        city = "Pune";
        A.city= "Bharat";

        System.out.println("Local Var : "+ city);
        System.out.println("Static/Global Var : "+A.city);


    }
}
