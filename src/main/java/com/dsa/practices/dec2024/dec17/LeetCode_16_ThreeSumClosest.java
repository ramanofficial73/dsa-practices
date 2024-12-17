package com.dsa.practices.dec2024.dec17;

public class LeetCode_16_ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        int target = 1;
        System.out.println("return : " + threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        for (int i =0; i<=nums.length-1; i++) {
            if (target == nums[i]) {
                int closetFirst = nums[i-1];
                int closetSecond = nums[i-2];
                int closetThird = nums[i];
                return closetSecond +closetFirst +  closetThird;
            }
        }
        return 0;
    }
}
