package com.dsa.practices.feb2025.stack;

import java.util.Arrays;
import java.util.Stack;

public class Question_Stack_RemoveConsecutiveSubsequnace {
    public static void main(String[] args) {
        int[] data = {1, 2, 2, 3, 10, 10, 10, 10, 4, 4, 4, 55};
        int[] res = removes(data);
        System.out.println(Arrays.toString(res));
    }

    private static int[] removes(int[] data) {
        /* {1, 2, 2, 3, 10, 10, 10, 10, 4, 4, 4, 55} */
        Stack<Integer> stack = new Stack<>();
        int n = data.length;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || stack.peek() != data[i]) {
                stack.push(data[i]);
            } else {
                if (i == n - 1 || data[i] != data[i + 1]) {
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
