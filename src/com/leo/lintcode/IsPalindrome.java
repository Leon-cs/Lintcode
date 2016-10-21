package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/21 18:51.
 */
public class IsPalindrome {

    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length()-1;
        char[] chars = s.toUpperCase().toCharArray();
        while (left != right && left < s.length() && right > 0){
            //System.out.println(chars[left] + "  " + chars[right]);
            if (('A' > chars[left] || 'z' < chars[left]) && ('0' > chars[left] || '9' < chars[right])){
                left++;
                continue;
            }
            if (('A' > chars[right] || 'z' < chars[right]) && ('0' > chars[right] || '9' < chars[right])){
                right--;
                continue;
            }
            if (chars[left] == chars[right]){
                left ++;
                right --;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("1a2"));
    }
}
