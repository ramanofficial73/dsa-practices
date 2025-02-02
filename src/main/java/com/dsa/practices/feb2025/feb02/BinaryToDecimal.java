package com.dsa.practices.feb2025.feb02;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int data = 5;
        StringBuilder sb = new StringBuilder();
        while (data > 0) {
            int rem = data % 2;   // Get remainder (0 or 1)
            sb.append(rem);       // Append to binary string
            data = data / 2;      // Divide by 2
        }
        System.out.println(sb);
    }
}
