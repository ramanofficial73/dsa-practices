package com.dsa.practices.basic;

/*  GCD is the largest number that divides both numbers.
    Efficiently, we use the Euclidean algorithm:
    repeatedly replace (a, b) with (b, a % b) until b = 0.
*/
public class GCDNumbers {

    public static void main(String[] args) {
        System.out.println("Get GCD with O(n) : " + getGCD(100, 75));
        getGCDWithOptimize(100, 75);
    }

    public static int getGCD(int num1, int num2) {
        int min = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void getGCDWithOptimize(int num1, int num2) {
        int min = Math.min(num1, num2);
        for (int i = min; i > 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
