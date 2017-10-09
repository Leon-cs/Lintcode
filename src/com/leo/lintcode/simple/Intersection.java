package com.leo.lintcode.simple;

import java.util.*;

/**
 * Created by ChangSheng on 2016/10/21 13:43.
 */
public class Intersection {

    private int[] getInt(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (null == nums1 || null == nums2) return null;
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int pointerNum1 = 0;
        int pointerNum2 = 0;
        while (pointerNum1 < nums1.length && pointerNum2 < nums2.length) {
            if (nums1[pointerNum1] < nums2[pointerNum2]) pointerNum1++;
            else if (nums1[pointerNum1] > nums2[pointerNum2]) pointerNum2++;
            else {
                if (!map.containsKey(nums1[pointerNum1])){
                    map.put(nums1[pointerNum1],0);
                    list.add(nums1[pointerNum1]);
                }
                pointerNum1++;
                pointerNum2++;
            }
        }
        return getInt(list);
    }

    public static void main(String[] args) {

    }
}
