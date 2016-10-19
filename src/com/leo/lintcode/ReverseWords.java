package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/19 15:54.
 */
public class ReverseWords {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        // write your code
        s = s.trim();
        String[] list = s.split(" ");
        String result = "";
        for (int i = list.length-1; i >= 0; i--){
            //System.out.println(list[i]);
            if (list[i].equals(" ") || list[i].length()==0){
                continue;
            }
            list[i] = list[i].trim();
            result = result + list[i] + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "    the     sky is blue   ";
        System.out.println(new ReverseWords().reverseWords(s));
    }
}
