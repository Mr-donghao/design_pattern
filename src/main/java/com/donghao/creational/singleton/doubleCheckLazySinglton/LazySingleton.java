package com.donghao.creational.singleton.doubleCheckLazySinglton;

public class LazySingleton {
    //volatitle 禁止该初始化该对象的指令重排序，保证线程安全的初始化
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                    /**
                     * new一个对象的三个步骤
                     * 1.分配内存给新创建对象
                     * 2.初始化对象
                     * 3.设置lazySingleton指向1.中分配的内存地址
                     *
                     * 以上三个步骤可能会被重排序：2和3互换顺序
                     * intra-thread semantics -- 保证指令重排序不会影响单线程内的执行结果
                     *
                     * 多线程时存在问题：
                     *      当A线程进入锁内初始化对象并且放生指令重排序时，线程B可能会在3执行后访问该对象。此时2还未执行，对象还未完成初始化。肯定出问题
                     *
                     * 如何解决这个问题
                     *      1.禁止初始化该对象时的指令重排序 对应解决方法1
                     *      2.使后来的线程看不到这次的指令重排序   对应解决方法2
                     *
                     *  解决方法
                     *      1.使用volatile 修饰该对象。
                     *      2 静态内部类 在包staticInnerClass包中实现
                     */
                }

            }
        }
        return lazySingleton;
    }
}
/**
 * 双重检查
 * 锁定放到方法体中
 */

