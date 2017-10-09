package com.leo.lintcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ChangSheng on 2016/11/1 9:11.
 */
public class IsHappy {

    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();
        int result = n;
        while (true){
            result = computer(result);
            if (result == 1) return true;
            if (map.containsKey(result)) {
                return false;
            } else {
                map.put(result,result);
            }
        }
    }

    private int computer(int n) {
        int result = 0;
        while (n != 0){
            result += (int)Math.pow(n % 10, 2);
            n = n / 10;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new IsHappy().isHappy(19));
    }
}
