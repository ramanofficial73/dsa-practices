package com.dsa.practices.dec2024.dec29;

public class LeetCode_ArrayList_09_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(112));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int number = x;
        int reverseNumber = 0;
        while (number > 0) {
            int reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number / 10;
        }
        if (reverseNumber == x) {
            return true;
        } else {
            return false;
        }
    }

}
