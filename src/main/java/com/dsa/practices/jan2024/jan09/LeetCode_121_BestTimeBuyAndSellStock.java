package com.dsa.practices.jan2024.jan09;

public class LeetCode_121_BestTimeBuyAndSellStock {
    public static void main(String[] args) {
        int[] data = {7,6,4,3,1};
        System.out.println(maxProfit(data));
    }

    public static int maxProfit(int[] prices) {
        int maxPrices = 0;
        for (int i=0; i< prices.length; i++) {
            for (int j=i+1; j< prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxPrices = Math.max(profit, maxPrices);
            }
        }
        return maxPrices;
    }
}
