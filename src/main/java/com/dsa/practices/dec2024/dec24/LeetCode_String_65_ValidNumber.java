package com.dsa.practices.dec2024.dec24;

public class LeetCode_String_65_ValidNumber {
    public static void main(String[] args) {
        System.out.println(isNumber(""));
    }

    public static boolean isNumberIsNormal(String s) {
        double value = Double.parseDouble(s);
        return !Double.isInfinite(value) && !Double.isNaN(value);
    }

    public static boolean isNumber(String s) {
        s = s.trim();
        boolean hasDigit = false;
        boolean hasE = false;
        boolean hasDot = false;
        for (int i = 0; i < s.length(); i++) {
            char charValue = s.charAt(i);
            if (Character.isDigit(charValue)) {
                hasDigit = true;
            } else if (charValue == '.') {
                if (hasDot || hasE) {
                    return false;
                }
                hasDot = true;
            } else if (charValue == 'e' || charValue == 'E') {
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                hasDigit = false;
            } else if (charValue == '+' || charValue == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return hasDigit;
    }
}
