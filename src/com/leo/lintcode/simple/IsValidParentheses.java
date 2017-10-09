package com.leo.lintcode.simple;

import java.util.Stack;

/**
 * Created by ChangSheng on 2016/10/21 19:12.
 */
public class IsValidParentheses {

    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // Write your code here
        if (s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            //System.out.println(stack.peek());
            switch (chars[i]){
                case '}' :
                    if (stack.size() == 0 || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']' :
                    if (stack.size() == 0 || stack.pop() != '['){
                        return false;
                    }
                    break;
                case ')' :
                    if (stack.size() == 0 || stack.pop() != '('){
                        return false;
                    }
                    break;
                default:
                    stack.push(chars[i]);
                    break;
            }
        }
        if (stack.size() > 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsValidParentheses().isValidParentheses("(("));
    }
}
