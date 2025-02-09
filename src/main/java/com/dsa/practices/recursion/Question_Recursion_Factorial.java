package com.dsa.practices.recursion;

public class Question_Recursion_Factorial {
    /*
    What is a Factorial Number?
    The factorial of a number n (denoted as n!) is the product of all positive integers from 1 to n.

    Mathematical Formula:
    n! = n×(n−1)×(n−2)×....x1

    For example:
    5!=5×4×3×2×1=120


    */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        /* 5! => 5 * 4 * 3 * 2 * 1 = 120 */
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact = factorial(n - 1);
        return n * fact;
    }

}
