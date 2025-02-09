package com.dsa.practices.recursion;

public class Question_Recursion_PrintNaturalNumbers {
    public static void main(String[] args) {
        naturalNumberAsc(5);
        System.out.println();
        naturalNumberDesc(5);
    }

    /* Increasing number */
    public static void naturalNumberAsc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        naturalNumberAsc(n - 1);
        System.out.print(n + " ");
    }



    public static void naturalNumberDesc(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        naturalNumberDesc(n - 1);
    }

}
