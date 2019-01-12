package com.donghao.creational.singleton.stopSerializationBreakHungrySingleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton ;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
    }
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 解决序列化反序列化对单例模式的破坏，emmm很神奇吧。必须这么写。
     * @return
     */
    private Object readResolve(){
        return hungrySingleton;
    }
}
