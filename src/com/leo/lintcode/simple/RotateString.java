package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/10/18 9:32.
 */
public class RotateString {

    public char[] rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0) return str;
        offset = offset % str.length;
        for (int i = 0; i < offset; i++){
            char ch = str[str.length-1];
            for (int j = 0; j < str.length; j++){
                char temp = str[j];
                str[j] = ch;
                ch = temp;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        char[] str = {'1','3','4','5'};
        char[] result = new RotateString().rotateString(str,8);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
