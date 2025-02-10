package com.dsa.practices.recursion;

public class Question_Recursion_PrintNaturalsSum {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int nums) {
        if (nums == 0) {
            return 0;
        }
        return sum(nums - 1) + nums;
    }

}
