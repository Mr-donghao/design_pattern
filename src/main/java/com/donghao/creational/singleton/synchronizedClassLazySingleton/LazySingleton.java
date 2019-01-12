package com.donghao.creational.singleton.synchronizedClassLazySingleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }


    public synchronized static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
/**
 * 1.在getInstance方法上加上synchronized,使该方法变为同步方法。此时可以认为只有一个线程能进入该类
 *     注：该关键字加在static方法上，则锁加在该类的class文件上
 *         加在非静态文件上，锁的是该类在内存中的一个对象
 *
 */
