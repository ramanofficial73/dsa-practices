package com.dsa.practices.dec2024.dec23;

public class DSA_Recursion {
    /*
        Recursion is a programming technique where a function calls itself to solve a problem by
        breaking it into smaller sub-problems.

        1. Base Case: Stops recursion.
        2. Recursive Case: Calls itself with smaller inputs.

        Pros:
        1. Simplifies complex problems (e.g., tree traversal, Fibonacci).

        Cons:
        1. Can cause stack overflow if too deep.
        2. Less efficient than iteration in some cases.
     */

    public static void main(String[] args) {
//        printReversNumber(5);
        printNumber(10);
    }

    private static void printReversNumber(int number){
        if (number == 0) {
            return;
        }
        System.out.println(number);
        printReversNumber(number-1);
    }

    private static void printNumber(int number){
        if (number >= 10) {
            return;
        }
        System.out.println(number);
        printReversNumber(number + 1);
    }
}
