package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/18 9:55.
 */
public class KMP {

    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null) return -1;
        if (target.length() == 0) return 0;
        if (target.length() > source.length()) return -1;
        char[] sourceChar = source.toCharArray();
        char[] targetChar = target.toCharArray();
        char first = targetChar[0];
        int max = source.length() - target.length();
        for (int i = 0; i <= max ; i++){
            if (sourceChar[i] != first) continue;
            int j = i + 1;
            int end = j + target.length() - 1;
            for (int k = 1; j < end && sourceChar[j]
                    == targetChar[k]; j++, k++);

            if (j == end) {
                    /* Found whole string. */
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("dsxgdfdsxgdfgsgsfgfdsgsgsfgfdsdsxgdfgsgsfgfds".indexOf("dsxgdfgsgsfgfds"));
    }


}
