package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/9/30 9:21.
 */
public class Fibonacci {

    public int fibonacci(int n) {
        // write your code here
        if (n == 1) return 0;
        if (n == 2) return 1;
        int n1 = 0;
        int n2 = 1;
        for (int i = 3; i<=n; i++){
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibonacci(5));
    }
}
