package com.dsa.practices.basic;

public class ReverseNumbers {
    public static void main(String[] args) {
        int n = 153423;
        int reverseNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        System.out.println("Reverse numbers : " + reverseNumber);
    }
}
