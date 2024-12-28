package com.dsa.practices.dec2024.dec28;

public class LeetCode_String_420_StrongPasswordChecker {
    public static void main(String[] args) {
        System.out.println(strongPasswordChecker("123"));
    }

    public static int strongPasswordChecker(String password) {
        int length = password.length();

        boolean hasDigit = false, hasLower= false, hasUpper = hasUpper = false;

        if (length != 6) {
            return 6-3;
        }
        for (char c: password.toCharArray()) {
            if (Character.isUpperCase(c)){
                hasUpper = true;
            }
            if (Character.isLowerCase(c)){
                hasLower = true;
            }
            if (Character.isDigit(c)){
                hasDigit = true;
            }

            int missingTypes = 0;
            if (!hasDigit) {
                missingTypes++;
            }
            if (!hasUpper) {
                missingTypes++;
            }
            if (!hasLower) {
                missingTypes++;
            }

        }
        return 1;
    }
}
