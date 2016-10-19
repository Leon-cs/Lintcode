package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/18 13:53.
 */
public class BinarySearch {

    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int result = -1;
        if (nums == null || nums.length == 0) return result;
        int start = 0;
        int end = nums.length-1;
        int mid = nums.length / 2;
        while (true){
            if (start == end){
                if (nums[start] == target) return start;
                break;
            }
            if (end - start == 1) {
                if (nums[start] == target) return start;
                if (nums[end] == target) return end;
                break;
            }
            if (target > nums[mid]){
                start = mid;
                mid = (start+end)/2+(start+end)%2;
            }else{
                end = mid;
                mid = (start+end)/2+(start+end)%2 - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //[2,6,8,13,15,17,17,18,19,20], 15
        //[3,4,5,8,8,8,8,10,13,14] 8
        int[] nums = {3,4,5,8,8,8,8,10,13,14};
        System.out.println(new BinarySearch().binarySearch(nums,8));
    }
}
