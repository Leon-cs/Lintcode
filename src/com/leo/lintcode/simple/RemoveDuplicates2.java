package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/21 15:10.
 */
public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        int k = 0;
        for(int i=0;i<nums.length;i++){
            int j = 0;
            int temp = 1;
            while(j<k){
                if (temp == 2){
                    break;
                } else if (nums[i]==nums[j]){
                    temp ++;
                }
                j++;
            }
            if(j==k){
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-14,-14,-13,-13,-13,-13,-13,-13,-13,-12,-12,-12,-12,-11,-10,-9,-9,-9,-8,-7,-5,-5,-5,-5,-4,-3,-3,-2,-2,-2,-2,-1,-1,-1,-1,-1,0,1,1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,6,7,8,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,14,14,14,14,15,16,16,16,18,18,18,19,19,19,19,20,20,20,21,21,21,21,21,21,22,22,22,22,22,23,23,24,25,25};
        System.out.println(new RemoveDuplicates().removeDuplicates(nums));
    }
}
