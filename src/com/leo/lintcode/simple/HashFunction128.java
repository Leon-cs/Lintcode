package com.leo.lintcode.simple;

/**
 * Created by changsheng on 2017/10/9.
 */
public class HashFunction128 {
    /*
     * @param key: A string you should hash
     * @param HASH_SIZE: An integer
     * @return: An integer
     * 在数据结构中，哈希函数是用来将一个字符串（或任何其他类型）转化为小于哈希表大小且大于等于零的整数。一个好的哈希函数可以尽可能少地产生冲突。一种广泛使用的哈希函数算法是使用数值33，假设任何字符串都是基于33的一个大整数，比如：

hashcode("abcd") = (ascii(a) * 333 + ascii(b) * 332 + ascii(c) *33 + ascii(d)) % HASH_SIZE
     */
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        long result = 0;
        long temp = 1;
        for(int i=key.length-1;i>=0;i--){
            result += (int) key[i] * temp % HASH_SIZE;
            result = result % HASH_SIZE;
            temp = temp * 33 % HASH_SIZE;
        }
        return (int)result % HASH_SIZE;
    }

    public static void main(String[] args) {
        HashFunction128 hf = new HashFunction128();
        char[] key = new char[7];
        key[0] = 'u';
        key[1] = 'b';
        key[2] = 'a';
        key[3] = 'y';
        key[4] = 't';
        key[5] = 't';
        key[6] = 't';


        System.out.println(hf.hashCode(key , 1007));
    }
}
