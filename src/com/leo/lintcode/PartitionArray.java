package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/22 10:24.
 */
public class PartitionArray {

    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here;
        if (nums == null || nums.length == 0) return ;
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            while (Math.abs(nums[i]) % 2 == 1){
                i++;
            }
            while (Math.abs(nums[j]) % 2 == 0){
                j--;
            }
            if (i < j){
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{14,14,13,13};
        new PartitionArray().partitionArray(nums);
    }
}
