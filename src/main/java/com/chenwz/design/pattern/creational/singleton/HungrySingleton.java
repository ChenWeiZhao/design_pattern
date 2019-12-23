package com.chenwz.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉模式
 */
public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    /*
      类加载时实例就创建好，因此不用判断
     */
    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        //防御反射构造
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * ObjectInputStream中的源码
     * obj = desc.isInstantiable() ? desc.newIstance() : null
     * desc.isInstantiable() ：返回true
     * desc.newInstance()：利用反射创建对象
     * 解决利用序列化和反序列化创建的对象和之前的对象不是同一个
     */
    private Object readResolve(){
        return hungrySingleton;
    }

    /**
     * 克隆会破坏单例
     * 所以将return返回改为getInstance()确保单例
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
