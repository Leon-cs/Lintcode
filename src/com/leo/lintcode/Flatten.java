package com.leo.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Flatten {
    // TODO: 2016/10/18 写完
      // This is the interface that allows for creating nested lists.
      // You should not implement it, or speculate about its implementation
      public interface NestedInteger {
     
          // @return true if this NestedInteger holds a single integer,
          // rather than a nested list.
          public boolean isInteger();
     
          // @return the single integer that this NestedInteger holds,
          // if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();
     
          // @return the nested list that this NestedInteger holds,
          // if it holds a nested list
          // Return null if this NestedInteger holds a single integer
          public List<NestedInteger> getList();
      }

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (NestedInteger nestedInteger : nestedList){
            if (nestedInteger.isInteger()){
                result.add(nestedInteger.getInteger());
            }else{
                
            }
        }
        return result;
    }
}
