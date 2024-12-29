//package com.dsa.practices.dec2024.dec29;
//
//public class PermutationString {
//    public static void main(String[] args) {
//        String str = "ABC";
//        printPermutations(str, "", 0);
//    }
//
//    private static void printPermutations(String str, String perm, int index) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.length() == 0) {
//                System.out.println(perm);
//                return;
//            }
//            char currentChar = str.charAt(i);
//            String nextChar = str.substring(0, i) + str.substring(i + 1);
//            printPermutations(nextChar, perm + currentChar, index + 1);
//        }
//    }
//
//
//}
