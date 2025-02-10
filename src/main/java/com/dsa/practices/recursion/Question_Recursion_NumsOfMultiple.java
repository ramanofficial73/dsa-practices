package com.dsa.practices.recursion;

public class Question_Recursion_NumsOfMultiple {

    /* Problem : 5 10 15 20 25 30 35 40 */
    public static void main(String[] args) {
        multiple(5, 8);
    }

    public static void multiple(int nums, int k) {
        if (k == 0) {
            return;
        }
        multiple(nums, k - 1);
        System.out.print(nums * k + " ");
    }

}
