package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/19 13:50.
 */
public class MaxSubArray {

    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     * 动态规划求最大子数组
     */
    public int maxSubArray(int[] nums) {
        // write your code
        if (nums == null || nums.length == 0) return 0;
        int currentSum = 0;
        int maxSum = 0;
        int maxNum = nums[0];
        for (int num : nums) {
            currentSum = currentSum + num;
            if (currentSum < 0){
                currentSum = 0;
            }
            if (maxNum < num){
                maxNum = num;
            }
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        if (maxSum == 0) return maxNum;
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = new int[]{
            -2,-2,-3,-4,-1,-2,-1,-5,-3
        };
        System.out.println(new MaxSubArray().maxSubArray(a));
    }
}
