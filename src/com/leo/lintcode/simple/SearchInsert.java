package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/19 16:25.
 */
public class SearchInsert {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     * 二分查找
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        int mid = A.length / 2;
        while (true){
            if (start == end){
                if (A[start] == target) {
                    return start;
                }else{
                    int i = A[start] > target ? start - 1 : start + 1;
                    return i > 0 ? i : 0;
                }
            }
            if (end - start == 1) {
                if (A[start] == target){
                    return start;
                }
                if (A[end] == target){
                    return end;
                }
                if (target < A[start]){
                    return start - 1 > 0 ? start - 1 : 0;
                }
                if (target > A[end]){
                    return end + 1;
                }
                if (target > A[start]){
                    return start + 1;
                }
            }
            if (target > A[mid]){
                start = mid;
                mid = (start + end) / 2 + (start + end) % 2;
            } else {
                end = mid;
                mid = (start + end) / 2 + (start + end) % 2 - 1;
            }
        }
    }

    public int searchInsert2(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == A[mid]){
                return mid;
            } else if (A[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,5,7,8,9};
        System.out.println(new SearchInsert().searchInsert(a,4));
    }
}
