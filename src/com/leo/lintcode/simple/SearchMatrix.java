package com.leo.lintcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ChangSheng on 2016/10/18 15:35.
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j++){
                map.put(matrix[i][j],i+j);
            }
        }
        if (map.containsKey(target)) return true;
        else return false;
    }


}
