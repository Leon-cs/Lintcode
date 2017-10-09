package com.leo.lintcode.simple;


/**
 * Created by ChangSheng on 2016/10/13 16:09.
 */
public class ReplaceBlank {

    //做替换一般使用倒序,然后用两个指针来确定位置
    public int replaceBlank(char[] string, int length) {
        int pOld = 0;
        // Write your code here
        int blank = 0;
        for (int i = 0 ; i < length ; i++){
            ++pOld;
            if (string[i] == ' '){
                blank ++;
            }
        }
        int pNew = length + blank * 2;
        int result = length + blank * 2;
        while (pOld>=0 && pNew > pOld){
            if (string[pOld] == ' '){
                string[pNew--] = '0';
                string[pNew--] = '2';
                string[pNew--] = '%';
            }else{
                string[pNew--] = string[pOld];
            }
            --pOld;
        }
        return result;
    }

    public static void main(String[] args) {
        char[] a = new char[10000];
        String s = " hello world ";
        for (int i = 0; i<s.length(); i++){
            a[i] = s.toCharArray()[i];
        }
        System.out.print(new ReplaceBlank().replaceBlank(a,13));
    }
}
