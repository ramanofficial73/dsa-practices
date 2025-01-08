package com.dsa.practices.jan2024.jan08;

public class LeetCode_1572_Matrix_DiagonalSum {

    public static void main(String[] args) {
        int[][] data = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(data));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int length = mat.length;
        for (int i=0; i<length; i++) {
            for (int j=0; j< length; j++) {
                if (i==j || i+j == length-1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
