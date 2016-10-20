package com.leo.lintcode;

import java.util.ArrayList;

/**
 * Created by ChangSheng on 2016/10/20 10:19.
 */
public class MergeSortedArray2 {

    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        if (A.length == 0 || A == null) A = B;
        if (B.length == 0 || B == null) return;
        ArrayList<Integer> result = new ArrayList<>(A.length);
        int Ai = 0;
        int Bi = 0;
        for (int i = 0; i < A.length; i++){
            //System.out.println(A[Ai] + "   " + Ai + "   " + B[Bi] + "   " + Bi);
            if (Ai == m){
                result.add(B[Bi]);
                Bi++;
                continue;
            }
            if (Bi == n){
                result.add(A[Ai]);
                Ai++;
                continue;
            }

            if (Ai < m && A[Ai] <= B[Bi]){
                result.add(A[Ai]);
                Ai++;
                continue;
            }else{
                result.add(B[Bi]);
                Bi++;
                continue;
            }
        }
        for (int i = 0; i < A.length; i++) {
            //System.out.println(result.get(i));
            A[i] = result.get(i);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[5];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;

        int[] B = new int[]{4,5};
        new MergeSortedArray2().mergeSortedArray(A,3,B,2);
    }
}
