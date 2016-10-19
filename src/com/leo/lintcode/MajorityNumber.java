package com.leo.lintcode;

import java.util.ArrayList;

/**
 * Created by ChangSheng on 2016/10/19 15:12.
 */
public class MajorityNumber {
    /**
     * @param nums: a list of integers
     * @return:     find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        if (nums == null || nums.isEmpty()) {
            return 0;
        }
        int majorityNumber = nums.get(0);
        int maxSize = 0;
        for (Integer num : nums) {
            if (num == majorityNumber){
                maxSize++;
            } else {
                maxSize--;
            }
            //System.out.println(maxSize+ "    " + num);
            if (maxSize == 0){
                majorityNumber = num;
                maxSize = 1;
            }
        }
        return majorityNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(1);
        System.out.println(new MajorityNumber().majorityNumber(a));
    }
}
