package com.dsa.practices.feb2025.stack;

import java.util.Arrays;

public class Question_Stack_NextGreaterElement {
    public static void main(String[] args) {
        int[] data = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] res = getGreaterElement(data);
        System.out.println(Arrays.toString(res));
    }

    /* Using For Loop */
    private static int[] getGreaterElement(int[] data) {
        /* {1, 3, 2, 1, 8, 6, 3, 4} */
        int[] res = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            res[i] = -1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[i]) {
                    res[i] = data[j];
                    break;
                }
            }
        }
        return res;
    }
}
