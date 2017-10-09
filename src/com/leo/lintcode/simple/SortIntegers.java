package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/9/30 10:56.
 */
public class SortIntegers {
    public void sortIntegers(int[] A){
        int temp = 0;
        for (int i = 0; i < A.length; i++){
            for (int j = i; j < A.length; j++){
                if (A[i] > A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{
            1,23,4
        };
        new SortIntegers().sortIntegers(a);
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
