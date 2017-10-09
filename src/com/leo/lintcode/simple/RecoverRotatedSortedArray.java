package com.leo.lintcode.simple;

import java.util.*;

/**
 * Created by ChangSheng on 2016/10/19 10:01.
 */
public class RecoverRotatedSortedArray {

    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        if (nums == null) return;
        for (int i = 0; i < nums.size(); i++){
            if (i+1 <= nums.size()-1 && nums.get(i) > nums.get(i+1)){
                nums.addAll(nums.subList(0,i+1));
                for (int i1 = 0; i1 < i+1; i1++) {
                    nums.remove(0);
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(1);
        nums.add(-1);
        nums.add(1);
        nums.add(1);

        new RecoverRotatedSortedArray().recoverRotatedSortedArray(nums);
        System.out.println();
        for (int i = 0; i < nums.size() ; i++){
            System.out.print(nums.get(i) + " ");
        }
    }
}
