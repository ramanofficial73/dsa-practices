package com.dsa.practices.jan2025.jan08;

public class LeetCode_867_TransposeMatrix {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
