package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/20 17:49.
 */
public class SingleNumber {

    public int singleNumber(int[] A) {
        // Write your code here
        int ans = 0;
        for(int i=0; i<A.length; ++i){
            ans ^= A[i];
            System.out.println(ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = new int[]{5,2,3,4,1,2,5,1,4};
        System.out.println(new SingleNumber().singleNumber(A));
    }
}
