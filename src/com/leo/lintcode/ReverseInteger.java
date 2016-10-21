package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/21 10:54.
 */
public class ReverseInteger {

    /**
     * @param n the integer to be reversed
     * @return the reversed integer
     */
    public int reverseInteger(int n) {
        // Write your code here
        StringBuffer sb = new StringBuffer();
        int temp = 1;
        if (n < 0){
            temp = -1;
            n = n * temp;
        }
        String str = sb.append(n).reverse().toString();
        try{
            return Integer.parseInt(str) * temp;
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverseInteger(-1250000000));
    }
}
