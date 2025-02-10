package com.dsa.practices.recursion;

public class Question_Recursion_SumOfDigitNumbers {

    /*
    Problem: Sum of digits of a number
    Approach
    Base Case: If the number becomes 0, return 0 (termination condition).
    Recursive Step: Extract the last digit using num % 10 and call the function with num / 10.
    Return the sum of the last digit and the result of the recursive call.
    */

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12341));
    }

    public static int sumOfDigits(int n) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int smallAns = sumOfDigits(n / 10);
        int lastDigit = n % 10;
        return smallAns + lastDigit;
    }

}
