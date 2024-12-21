package com.dsa.practices.dec2024.dec19;

public class SumElementsOfTheArray {
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 7};
        System.out.println("Sum of all elements : " + sumOfElements(num));
    }

    public static int sumOfElements(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }
}
