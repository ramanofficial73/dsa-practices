package com.dsa.practices.dec2024.dec31;

public class LeetCode_ArrayList_1491_AverageSalaryExcludingMinimumMaximumSalary {
    public static void main(String[] args) {
        int[] data = {4000, 3000, 1000, 2000};
        System.out.println(average(data));
    }

    public static double average(int[] salary) {
        int minSal = salary[0];
        int maxSal = salary[0];
        int avgSal = salary[0];

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < minSal) {
                minSal = salary[i];
            } else if (salary[i] > maxSal) {
                maxSal = salary[i];
            }
            avgSal = avgSal + salary[i];
        }
        avgSal = avgSal - maxSal - minSal;
        double ans = (double) avgSal / salary.length - 1;
        return ans;
    }

}
