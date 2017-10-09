package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/11/2 9:28.
 */
public class LeftPad {
    /**
     * @param originalStr the string we want to append to with spaces
     * @param size the target length of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        return leftPad(originalStr,size,' ');
    }

    /**
     * @param originalStr the string we want to append to
     * @param size the target length of the string
     * @param padChar the character to pad to the left side of the string
     * @return a string
     */
    static public String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
        if (size <= originalStr.length()){
            return originalStr;
        } else {
            int end = size - originalStr.length();
            for (int i = 0; i < end; i++){
                originalStr = padChar + originalStr;
            }
            return originalStr;
        }
    }

    public static void main(String[] args) {
        System.out.println(leftPad("TEST", 20, '+'));
    }
}
