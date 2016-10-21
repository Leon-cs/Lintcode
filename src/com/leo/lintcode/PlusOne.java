package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/21 18:25.
 */
public class PlusOne {

    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Write your code here
        int temp = 1;
        for (int i = digits.length - 1 ; i >= 0 ; i--){
            digits[i] = digits[i] + temp;
            temp = digits[i] / 10;
            if (temp > 0){
                digits[i] = digits[i] % 10;
            }
        }
        int[] result = new int[digits.length+1];
        if (temp > 0){
            result[0] = temp;
            for (int i = 0; i<digits.length; i++){
                result[i+1] = digits[i];
            }
        }else{
            result = digits;
        }
        return result;
    }


}
