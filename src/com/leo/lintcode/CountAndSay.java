package com.leo.lintcode;

import sun.plugin2.gluegen.runtime.StructAccessor;

/**
 * Created by ChangSheng on 2016/10/22 11:13.
 */
public class CountAndSay {

    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        if (n == 0) return "";
        String[] strings = new String[n];
        strings[0] = "1";
        if (n == 1) return strings[0];
        for (int i = 1; i < strings.length; i++){
             strings[i] = read(strings[i-1]);
        }
        return strings[n-1];
    }

    private String read(String string) {
        char[] chars = string.toCharArray();
        string = "";
        int temp = 0;
        char ch = chars[0];
        for (int i = 0; i < chars.length; i++){
            if (ch == chars[i]) {
                temp++;
            } else {
                string += temp + String.valueOf(ch);
                ch = chars[i];
                temp = 1;
            }
        }
        string  += temp + String.valueOf(ch);
        return string;
    }

    public static void main(String[] args) {
        System.out.println(new CountAndSay().countAndSay(6));
    }

}
