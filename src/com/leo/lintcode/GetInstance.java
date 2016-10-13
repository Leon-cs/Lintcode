package com.leo.lintcode;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by ChangSheng on 2016/10/13 13:51.
 */
public class GetInstance {

    private static GetInstance instance = null;

    private static ReadWriteLock rwl = new ReentrantReadWriteLock();

    private GetInstance(){}

    //这样的单例模式写操作在性能上会大打折扣 synchronized
    /*public static Solution getInstance() {
        // write your code here
        if (instance == null){
            synchronized (Solution.class){
                if (instance == null){
                    instance = new Solution();
                }
            }
        }
        return instance;
    }*/

    public static GetInstance getInstance(){
        //要读取数据了,先上锁,防止并发线程竞争
        rwl.readLock().lock();
        try{
            if (null == instance){
                //没有数据打开读锁
                rwl.readLock().unlock();
                //进行写数据上锁
                rwl.writeLock().lock();
                if (null == instance){
                    instance = new GetInstance();
                }
                //数据写完了,解锁
                rwl.writeLock().unlock();
            }
            //有数据先上锁,防止多线程访问
            rwl.readLock().lock();
        } finally {
            //一定记住在finally中解锁
            rwl.readLock().unlock();
        }
        return instance;
    }

    public static void main(String[] args) {
        GetInstance a = null;
        a = a.getInstance();
        GetInstance b = null;
        b = b.getInstance();
        if (a == b && a != null && b != null){
            System.out.print(123);
        }
    }
}
