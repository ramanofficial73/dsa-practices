package com.dsa.practices.recursion;

public class Question_Recursion_AlternativeSeriesOfSum {

    /* 1 - 2 + 3 -4 + 5 = 3 */
    public static void main(String[] args) {
        System.out.println(seriesOfSum(5));
    }

    public static int seriesOfSum(int number) {
        if (number == 0) {
            return 0;
        }
        int smallSum = seriesOfSum(number - 1);
        if (number % 2 == 0) {
            return smallSum - number;
        } else {
            return smallSum + number;
        }
    }
}
