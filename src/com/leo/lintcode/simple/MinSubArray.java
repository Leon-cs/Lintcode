package com.leo.lintcode.simple;

import java.util.ArrayList;

/**
 * Created by ChangSheng on 2016/10/19 14:53.
 */
public class MinSubArray {

    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.isEmpty()) return 1073741823;
        int currentSum = 0;
        int minSum = 0;
        int minNum = nums.get(0);
        for (Integer num : nums) {
            currentSum = currentSum + num;
            if (currentSum > 0){
                currentSum = 0;
            }
            if (num < minNum){
                minNum = num;
            }
            if (currentSum < minSum){
                minSum = currentSum;
            }
        }
        if (minSum == 0) return minNum;
        return minSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        System.out.println(new MinSubArray().minSubArray(a));
    }
}
