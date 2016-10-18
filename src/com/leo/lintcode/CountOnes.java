package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/13 19:35.
 */
public class CountOnes {

    //n相当于在n - 1的最低位加上1。举个例子，8（1000）= 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）= 0（0000）
    public int countOnes(int num){
        if (num < 0 ){
            return 32 - getOnes(Math.abs(num)- 1 );
        }
        return getOnes(num);
    }

    private int getOnes(int positiveNumber){
        int c;
        for (c =0; c < positiveNumber; ++c)
        {
            positiveNumber &= (positiveNumber -1) ; // 清除最低位的1
        }
        return c ;
    }

    public static void main(String[] args) {
        System.out.println(new CountOnes().countOnes(-34));
    }
}
