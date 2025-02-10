package com.dsa.practices.recursion;

public class Question_Recursion_PowerOfNumber {

    public static void main(String[] args) {
        System.out.println(powerOfNumber(1, 4));
    }

    public static int powerOfNumber(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int leastPowerOfNumber = powerOfNumber(number, power - 1);
        return leastPowerOfNumber * number;

    }

}
