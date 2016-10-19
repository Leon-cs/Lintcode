package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/13 20:51.
 */
public class FindMin {

    /**
     * 二分查找最小数
     * @param nums  int[]
     * @return      int
     */

    private int findMin(int[] nums){
        int len = nums.length;
        if (len == 1) return nums[0];
        return findMin(nums,0,len/2-1) < findMin(nums,len/2,len-1) ? findMin(nums,0,len/2-1) : findMin(nums,len/2,len-1);
    }

    private int findMin(int[] nums, int start, int end) {
        if (start == end) return nums[start];
        if (end - start == 1) return nums[start] < nums[end] ? nums[start] : nums[end];
        return findMin(nums,start,(start+end)/2+(start+end)%2-1) < findMin(nums,(start+end)/2+(start+end)%2,end)
                ? findMin(nums,start,(start+end)/2+(start+end)%2-1) : findMin(nums,(start+end)/2+(start+end)%2,end);
    }

    /*int findMin(int[] nums) {
        // write your code here
        int l = 0;
        int r = nums.length-1;
        if(nums[l]<nums[r])
            return nums[l];
        while(l<r)
        {
            int mid = (l+r)/2;
            if(nums[mid]>nums[r])
                l = mid+1;
            else
                r = mid;
        }
        return nums[l];
    }*/

    public static void main(String[] args) {
        int[] nums = {3,1,2,2,42,43};
        System.out.println(new FindMin().findMin(nums));
    }
}
