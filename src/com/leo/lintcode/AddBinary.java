package com.leo.lintcode;

/**
 * Created by ChangSheng on 2016/10/25 9:09.
 */
public class AddBinary {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        if ("0".equals(a) || null == a || a.length() == 0) return b;
        if ("0".equals(b) || null == b || b.length() == 0) return a;
        String result = "";
        int ai = a.length() - 1;
        int bi = b.length() - 1;
        char temp = '0';
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();
        while (ai >= 0 && bi >= 0){
            int num = charsa[ai] + charsb[bi] + temp;
            if (num == 147){
                temp = '1';
                result = "1" + result;
            } else if (num == 146){
                temp = '1';
                result = "0" + result;
            } else if (num == 145){
                temp = '0';
                result = "1" + result;
            } else if (num == 144){
                temp = '0';
                result = "0" + result;
            }
            ai--;
            bi--;
        }

        if (ai >= 0){
            result = dealLast(ai,charsa,temp,result);
        } else if (bi >= 0){
            result = dealLast(bi,charsb,temp,result);
        }
        if (temp == '1' && bi < 0 && ai < 0) result = temp + result;
        return result;
    }

    private String dealLast(int size, char[] chars, char temp, String result) {
        for (int i = size; i >= 0; i--){
            int num = temp + chars[i];
            if (num == 98){
                temp = '1';
                result = '0' + result;
            } else if (num == 97){
                temp = '0';
                result = '1' + result;
            } else if (num == 96){
                temp = '0';
                result = '0' + result;
            }
        }
        if (temp == '1') result = temp + result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("10","110010"));
    }
}
/*int num = '1' + '1' + '1';
        System.out.println(num);
            num = '1' + '1' + '0';
            num = '0' + '1' + '1';
            num = '1' + '0' + '1';
        System.out.println(num);
            num = '0' + '1' + '0';
            num = '1' + '0' + '0';
            num = '0' + '0' + '1';
        System.out.println(num);
            num = '0' + '0' + '0';
        System.out.println(num);*/
        /*int num = '1' + '1';
        System.out.println(num);
        num = '1' + '0';
        System.out.println(num);
        num = '0' + '0';
        System.out.println(num);*/