package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/10 9:26.
 */
public class TrailingZeros {

    /**
     * @param n         long
     * @return          long
     */
    private long trailingZeros(long n) {
        // write your code here
        long temp = n;
        long count = 0;
        while (temp!=0){
            count +=temp/5;
            temp = temp/5;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZeros().trailingZeros(20));
    }
}
