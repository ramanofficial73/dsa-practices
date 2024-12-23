package com.dsa.practices.dec2024.dec23;

public class DSA_Recursion_Pratices {
    public static void main(String[] args) {
//        System.out.println(getFactorial(5));

        System.out.println("Natural Number sum : " + getNaturalNumberSum(10));

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
