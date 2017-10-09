package com.leo.lintcode.simple;

import java.util.Arrays;

/**
 * Created by changsheng on 2017/10/9.
 */
public class Permutation211 {

    /*
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        if (A.length() != B.length()) return false;
        char[] aChars = A.toCharArray();
        char[] bChars = B.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return String.valueOf(aChars).equals(String.valueOf(bChars));
    }

    public static void main(String[] args) {

    }
}
