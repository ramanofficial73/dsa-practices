package com.dsa.practices.basic;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n = 153;
        int length = String.valueOf(n).length();
        int dup = n;
        int sums = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            sums = sums + (int) Math.pow(lastDigit, length);
        }
        if (sums == dup) {
            System.out.println("Yes, is an Armstrong number.");
        } else {
            System.out.println("No, is NOT an Armstrong number.");
        }
    }
}
