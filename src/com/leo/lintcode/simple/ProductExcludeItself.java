package com.leo.lintcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChangSheng on 2016/10/26 9:30.
 */
public class ProductExcludeItself {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> b = new ArrayList<>(A.size());
        for (int i = 0; i < A.size(); i++){
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            if (i - 1 >= 0){
                left = A.subList(0,i);
            }
            if (i + 1 < A.size()){
                right = A.subList(i+1,A.size());
            }
            long resulti = 1;
            for (int j = 0; j < left.size(); j++){
                //System.out.print("left  " + j + "    " +left.get(j)+"   ");
                resulti *= left.get(j);
            }
            for (int j = 0; j < right.size(); j++){
                //System.out.print("right  " + j + "    " +right.get(j)+"   ");
                resulti *= right.get(j);
            }
            b.add(resulti);
            //System.out.println();
        }
        return b;
    }

    public static void main(String[] args) {
        ArrayList<Long> b = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b = new ProductExcludeItself().productExcludeItself(a);
        for (int i = 0; i<b.size(); i++){
            System.out.println(b.get(i));
        }
    }
}
