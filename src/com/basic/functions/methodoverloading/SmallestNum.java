package com.basic.functions.methodoverloading;

public class SmallestNum {

    public static int smallestNum (int num1, int num2){
        int temp = num1 < num2 ? num1 : num2;
        return temp;
    }

    public static int smallestNum (int num1, int num2, int num3){
        int temp = num1 < num2 ? num1 : num2;
        int temp1 = num3 < temp ? num3 : temp;
        return temp1;
    }

    public static int smallestNum (int num1, int num2, int num3, int num4){
        int temp = num1 < num2 ? num1 : num2;
        int temp1 = num3 < temp ? num3 : temp;
        int temp2 = num4 < temp1 ? num4 : temp1;
        return temp2;
    }

    public static void main(String[] args) {

        System.out.println("Smallest of 2 num : "+ smallestNum(12,4));
        System.out.println("Smallest of 3 num : "+ smallestNum(12,1,5));
        System.out.println("Smallest of 4 num : "+ smallestNum(9,3,6,0));
    }
}
