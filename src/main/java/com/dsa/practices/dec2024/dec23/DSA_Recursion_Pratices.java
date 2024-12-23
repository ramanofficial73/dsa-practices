package com.dsa.practices.dec2024.dec23;

public class DSA_Recursion_Pratices {
    public static void main(String[] args) {
//        System.out.println(getFactorial(5));

//        System.out.println("Natural Number sum : " + getNaturalNumberSum(10));

//        int n = 10;
//        for (int i = 0; i <= n; i++) {
//            System.out.print(" " + fibonacci(i));
//        }

//        String name = "raman";
//        System.out.println("Reverse String : " + reverseString(name, name.length() - 1));

        String name1 = "ma2dam";
        System.out.println(checkPolindrom(name1, 0, name1.length() - 1));

    }

    private static boolean checkPolindrom(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPolindrom(str, start + 1, end - 1);
    }

    private static String reverseString(String name, int index) {
        if (index < 0) {
            return "";
        }
        return name.charAt(index) + reverseString(name, index - 1);
    }

    private static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    private static int getNaturalNumberSum(int number) {
        if (number == 1) {
            return 1;
        }
        int naturalNumberSum = getNaturalNumberSum(number - 1);
        return number + naturalNumberSum;
    }

    private static int getFactorial(int number) {
        if (number == 1 || number == 0) {
            return number;
        }
        int fact = getFactorial(number - 1);
        int nLenght = fact * number;
        return nLenght;
    }

}
