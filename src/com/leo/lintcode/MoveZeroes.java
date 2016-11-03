package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/11/2 9:43.
 */
public class MoveZeroes {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {
        // Write your code here
        moveZeroes(nums,0);
    }

    private void moveZeroes(int[] nums, int n) {
        if (nums.length < 2) return ;
        int k = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == n){
                if (nums.length - k > i){
                    for (int j = i; j < nums.length - k; j++) {
                        nums[j] = nums[j+1];
                    }
                    nums[nums.length - k] = n;
                    k++;
                    i--;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes(new int[]{0,1,0,3,12});
    }
}
