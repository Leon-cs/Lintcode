package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/20 10:58.
 */
public class CompareStrings {

    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] index = new int[26];
        for (int i = 0; i < A.length(); i++) {
            index[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++) {
            index[B.charAt(i) - 'A']--;
            if(index[B.charAt(i) - 'A'] < 0){
                return false;
            }
        }
        return true;
    }


}
