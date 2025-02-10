package com.dsa.practices.recursion;

public class Question_Recursion_GreatestCommonDivisor {

    /*
     * The Greatest Common Divisor (GCD) of two numbers is the largest number
     * that divides both numbers without leaving a remainder.
     * */
    public static void main(String[] args) {
        System.out.println(getGCD1(16, 2));
        System.out.println(getGCD2(16, 2));
        System.out.println(getGCD3(15, 12));
    }

    /* Using Brute Force Approach */
    public static int getGCD1(int num1, int num2) {
        int min = Math.min(num1, num2);
        int gcd = 1;
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                return gcd;
            }
        }
        return gcd;
    }

    /*
     * Algorithm (Using Long Division)
     * Start with two numbers a and b.
     * Divide the larger number by the smaller one.
     * Replace the larger number with the remainder.
     * Repeat until the remainder is 0. The last non-zero divisor is the GCD.
     * */
    public static int getGCD2(int num1, int num2) {
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }


    /* Euclidean Algorithm (Efficient) -- Recursion
    * Formula: GCD(x, y) = GCD(y, x % y), Base Case: GCD(x, 0) = x
    * */
    public static int getGCD3(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD3(num2, num1 % num2);
    }

}
