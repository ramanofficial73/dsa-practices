package com.dsa.practices.basic;

public class CheckPalindromeNumbers {
    public static void main(String[] args) {
        int n = 1213;
        int dup = n;
        int reverseNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        if (reverseNumber == dup) {
            System.out.println("Yes, is palindrome numbers");
        } else {
            System.out.println("No, Given numbers is not palindrome numbers");
        }
    }
}
