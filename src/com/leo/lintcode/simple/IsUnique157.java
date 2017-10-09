package com.leo.lintcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by changsheng on 2017/10/9.
 */
public class IsUnique157 {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        char[] chars = str.toCharArray();
        Map<Character , Integer> map = new HashMap<>();
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                return false;
            } else {
                map.put(ch , 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
