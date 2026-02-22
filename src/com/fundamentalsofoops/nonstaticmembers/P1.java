package com.fundamentalsofoops.nonstaticmembers;

public class P1 {
    static int a;
    static char c;
    String s;
    boolean b ;

    public static void main(String[] args) {
        System.out.println("Default values : ");

        System.out.println(P1.a);
        System.out.println(P1.c);
        P1 ref = new P1();
        System.out.println(ref.s);
        System.out.println(ref.b);

        // Updating values
        P1.a = 10;
        P1.c = 's';

        ref.s= "Aditya";
        ref.b =true;

        System.out.println("Printing updated values");

        System.out.println(P1.a);
        System.out.println(P1.c);
        System.out.println(ref.s);
        System.out.println(ref.b);
        System.out.println("END");

    }

}
