package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/19 9:46.
 */
public class IsUgly {

    /**
     * @param num an integer
     * @return true if num is an ugly number or false
     */
    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        int factory = 2;
        while (factory <= num){
            if (num % factory == 0){
                num = num / factory;
                //System.out.print(factory + "  ");
                if (factory > 5) return false;
            }else{
                factory++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsUgly().isUgly(43221));
    }
}
