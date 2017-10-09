package com.leo.lintcode.simple;

import java.util.ArrayList;

/**
 * Created by ChangSheng on 2016/10/22 9:34.
 */
public class LongestWords {

    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> longestWords = new ArrayList<>();
        if (dictionary.length == 0) return longestWords;
        int maxLength = 0;
        for (int i = 0; i < dictionary.length; i++){
            if (dictionary[i].length() > maxLength){
                longestWords = new ArrayList<>();
                maxLength = dictionary[i].length();
                longestWords.add(dictionary[i]);
            } else if (dictionary[i].length() == maxLength){
                longestWords.add((dictionary[i]));
            }
        }
        return longestWords;
    }
}
