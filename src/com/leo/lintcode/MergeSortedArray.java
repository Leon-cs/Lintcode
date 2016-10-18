package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/18 9:13.
 */
public class MergeSortedArray {

    public int[] mergeSortedArray(int[] A, int[] B) {
        // Write your code here
        if (A.length == 0 || A == null) return B;
        if (B.length == 0 || B == null) return A;
        int[] result = new int[A.length + B.length];
        int Ai = 0;
        int Bi = 0;
        for (int i = 0; i < result.length; i++){
            if (Ai == A.length){
                result[i] = B[Bi];
                Bi++;
                continue;
            }
            if (Bi == B.length){
                result[i] = A[Ai];
                Ai++;
                continue;
            }

            if (A[Ai] <= B[Bi]){
                result[i] = A[Ai];
                Ai++;
                continue;
            }else{
                result[i] = B[Bi];
                Bi++;
                continue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        int[] result = new MergeSortedArray().mergeSortedArray(a,b);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
