package com.dsa.practices.dec2024.dec26;

public class LeetCode_String_314_Reverse_String {
    public static void main(String[] args) {
        char[] data ={'h','e','l','l','o'};
        reverseString(data);

        System.out.println(data);
    }

    public static void reverseString(char[] s) {
        int left=0;
        int right = s.length-1;
        while (left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
