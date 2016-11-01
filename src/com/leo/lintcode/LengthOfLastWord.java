package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/31 9:35.
 */
public class LengthOfLastWord {

    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        if (null == s || s.length() == 0) return 0;
        int maxSize = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--){
            if (chars[i] != ' '){
                maxSize++;
            } else {
                    if (maxSize > 0 && chars[i] == ' ') {
                    return maxSize;
            }
                maxSize = 0;
                continue;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord(" s  123421 432s 423sdf"));
    }

}
