package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/22 9:47.
 */
public class CheckPowerOf2 {

    /*
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        if (n <= 0) return false;
        return getOnes(n) > 1 ? false : true;
    }

    private int getOnes(int positiveNumber){
        int c;
        for (c =0; c < positiveNumber; ++c)
        {
            positiveNumber &= (positiveNumber -1) ; // 清除最低位的1
        }
        return c ;
    }

    //同理使用位运算清除最低位的1
    public boolean checkPowerOf2O1(int n){
        if(n<=0) return false;
        return (n & (n-1)) == 0 ? true : false;
    }

    public static void main(String[] args) {

    }
}
