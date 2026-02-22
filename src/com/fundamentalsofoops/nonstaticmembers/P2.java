package com.fundamentalsofoops.nonstaticmembers;


public class P2 {

    int a = 12;
    static char c = 'T';

    public void sheela (){
        System.out.println(P2.c);
        System.out.println(this.a);
        System.out.println(a);


    }

    public static void main(String[] args) {
        P2 ref = new P2();

        System.out.println("MB");
        System.out.println(P2.c);
        System.out.println(ref.a);
        ref.sheela();
        System.out.println("ME");


    }
}
