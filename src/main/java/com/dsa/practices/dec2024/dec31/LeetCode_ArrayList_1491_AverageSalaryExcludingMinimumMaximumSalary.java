package com.dsa.practices.dec2024.dec31;

public class LeetCode_ArrayList_1491_AverageSalaryExcludingMinimumMaximumSalary {
    public static void main(String[] args) {
        int[] data = {4000, 3000, 1000, 2000};
        System.out.println(average(data));
    }

    public static double average(int[] salary) {
        int minSal = salary[0];
        int maxSal = salary[0];
        int sum = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (minSal > salary[i]) {
                minSal = salary[i];
            }
            if (maxSal < salary[i]) {
                maxSal = salary[i];
            }
            sum = sum + salary[i];
        }
        sum = sum - maxSal - minSal;
        double ans = (double) sum / (salary.length - 2);
        return ans;
    }

}
