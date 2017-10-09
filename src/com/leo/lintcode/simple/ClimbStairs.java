package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/21 10:17.
 */
public class ClimbStairs {

    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        //return climbStairs(n,1)+climbStairs(n,2);
        if (n == 1) return 1;
        if (n == 2) return 2;
        int n1 = 1;
        int n2 = 2;
        for (int i = 3; i <= n; i++){
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }



    public static void main(String[] args) {
        System.out.println(new ClimbStairs().climbStairs(3));
    }
}
