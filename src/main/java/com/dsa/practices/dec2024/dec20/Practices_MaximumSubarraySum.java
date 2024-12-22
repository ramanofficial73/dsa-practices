package com.dsa.practices.dec2024.dec20;

import java.util.List;

public class Practices_MaximumSubarraySum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 5, 4, 200, 1, 3, 1, 100, 102, 103);
        Integer number = getMaxSumOfSubArray(numbers);
        System.out.println("Sum of subArray : " + number);
    }

    private static Integer getMaxSumOfSubArray(List<Integer> numbers) {
        int maxSum = numbers.get(0);
        if (numbers.isEmpty()) {
            return maxSum;
        }

        int currentSum = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            currentSum = Math.max(numbers.get(i), currentSum + numbers.get(i));
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
