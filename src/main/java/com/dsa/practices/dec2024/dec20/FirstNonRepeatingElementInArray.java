package com.dsa.practices.dec2024.dec20;

import java.util.HashMap;
import java.util.List;

public class FirstNonRepeatingElementInArray {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 5, 4, 200, 1, 3, 1, 100, 102, 103);
        int number = findFirstNonRepeatingElement(numbers);
        System.out.println("First non Repeating number: " + number);

    }

    private static int findFirstNonRepeatingElement(List<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
