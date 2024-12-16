package com.dsa.practices.dec2024.dec16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_01_TwoSum {
    public static void main(String[] args) {
        int[] data = {2,5,5, 10};
        System.out.println("Return list : " + Arrays.toString(getSum(data, 10)));
    }

//    private static int[] getSum(int[] listOfData, int target) {
//        for (int i = 0; i < listOfData.length; i++) {
//            int[] returnList = new int[2];
//            int currentIndex = i;
//            int currentElement = listOfData[i];
//            int nextIndex = i + 1;
//            int nextElement = 0;
//
//            if (nextIndex < listOfData.length) {
//                nextElement = listOfData[nextIndex];
//            } else if (nextIndex == listOfData.length ){
//                nextElement = listOfData[0];
//                currentIndex = 0;
//                nextIndex = nextIndex - 1;
//            }
//            int targetElement = currentElement + nextElement;
//            if (targetElement == target) {
//                returnList[0] = currentIndex;
//                returnList[1] = nextIndex;
//                return returnList;
//            }
//        }
//        return new int[]{0};
//    }

    private static int[] getSum(int[] listOfData, int target) {
        for (int i = 0; i < listOfData.length; i++) {
            for (int j= 1; j < listOfData.length; j++) {
                int[] returnList = new int[2];
                int currentIndex = i;
                int nextIndex = j;
                int currentElement = listOfData[i];
                int nextElement = listOfData[j];;

                int targetElement = currentElement + nextElement;
                if (targetElement == target && currentIndex != nextIndex) {
                    returnList[0] = currentIndex;
                    returnList[1] = nextIndex;
                    return returnList;
                }
            }
        }
        return new int[]{0};
    }
}
