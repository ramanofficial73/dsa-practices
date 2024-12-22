package com.dsa.practices.dec2024.dec20;

import java.util.HashSet;
import java.util.List;

public class Practices_LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 5, 4, 200, 1, 3, 2, 101, 102, 103);
        int longestSubsequence = findLongestConsecutiveSubsequence(numbers);
        System.out.println("Longest Consecutive Subsequence Length: " + longestSubsequence);

    }

    private static int findLongestConsecutiveSubsequence(List<Integer> numbers) {
        HashSet<Integer> numberSet = new HashSet<>(numbers);
        int longestStreak = 0;
        if (numbers.isEmpty()) {
            return 0;
        }

        for (int num : numberSet) {
            if (!numberSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numberSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
