package com.leo.lintcode;

import java.util.Arrays;

/**
 * Created by ChangSheng on 2016/10/20 16:25.
 */
public class Median {

    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int mid = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2;
        return nums[mid];
    }

    // TODO: 2016/10/20 利用快排思想实现时间复杂度为O(N)
    public int median2(int[] nums){

        return 1;
    }
    public static void main(String[] args) {

    }
}
