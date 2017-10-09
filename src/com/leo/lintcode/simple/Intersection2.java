package com.leo.lintcode.simple;

import java.util.*;

/**
 * Created by ChangSheng on 2016/9/30 14:41.
 */
public class Intersection2 {

    private int[] getInt(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * 适合已结排序好的两个数组
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        if (null == nums1 || null == nums2) return null;
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int pointerNum1 = 0;
        int pointerNum2 = 0;
        while (pointerNum1 < nums1.length && pointerNum2 < nums2.length) {
            if (nums1[pointerNum1] < nums2[pointerNum2]) pointerNum1++;
            else if (nums1[pointerNum1] > nums2[pointerNum2]) pointerNum2++;
            else {
                list.add(nums1[pointerNum1]);
                pointerNum1++;
                pointerNum2++;
            }
        }
        int[] result = getInt(list);
        return result;
    }

    /**
     * 不排序直接放入hashMap中O(n),适合没有重复数据
     * @return
     */
    /*public int[] intersection(int[] nums1, int[] nums2) {
        if (null == nums1 || null == nums2) return null;
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        int length = nums1.length > nums2.length ? nums2.length : nums1.length;
        LinkedList<Integer> list = new LinkedList<>();
        int index = 0;
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < nums1.length; i++){
            map.put(nums1[i],1);
        }
        for (int j = 0; j < nums2.length; j++){
            if (map.get(nums2[j]) != null && map.get(nums2[j]) == 1){
                list.add(nums2[j]);
                map.put(nums2[j],2);
            }
        }
        int[] result = getInt(list);
        return result;
    }*/

    /**
     * 对重复数据进行判断
     */
    public int[] otherIntersection(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i])){ // 唯一映射
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+ 1 );
            }
        }
        ArrayList<Integer> A = new ArrayList<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){ // 相同元素
                A.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])- 1 );
                if(map.get(nums2[i])==0)
                    map.remove(nums2[i]); // 去除相同元素
            }
        }
        int[] res = new int[A.size()];
        for(int i=0;i<A.size();i++){ // 保存到数组中
            res[i] = A.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        int[] list = new Intersection2().otherIntersection(nums1,nums2);
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
