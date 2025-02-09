package com.dsa.practices.recursion;

public class Question_Recursion_PrintNaturalNumbers {
    public static void main(String[] args) {
        naturalNumber(5);
    }

    /* Increasing number */
    public static void naturalNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        naturalNumber(n - 1);
        System.out.println(n);
    }


    /*
    public static void naturalNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        naturalNumber(n - 1);
    }
    */
}
