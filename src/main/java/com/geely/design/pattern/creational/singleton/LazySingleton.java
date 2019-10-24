package com.geely.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉模式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    /**
     * 如果为true代表该类还可以进行实例化
     * 但是也没法防御反射攻击，因为反射可以修改flag的值
     */
    private static boolean flag = true;

    private LazySingleton() {
        //if (flag = true) {
        //    flag = false;
        //} else {
        //    throw new RuntimeException("单例构造器禁止反射调用");
        //
        //}
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    /**
     * 加synchronized关键字，变成同步方法
     * 若加synchronized锁加在静态方法上，相当于锁的是类的class文件
     * 若不是静态方法，那么锁的是堆内存中生成的对象
     * 但同步锁比较消耗资源，有加锁和解锁开销，锁的class范围大
     */
    public synchronized static LazySingleton getInstance() {
        /* 小心当多个线程同时调用 getInstance() 方法时，可能会产生多个 instance 实例 */
        if (lazySingleton == null) {
            //延迟加载
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
        //和上面写法一样效果
        //synchronized (LazySingleton.class){
        //    if(lazySingleton == null){
        //        //延迟加载
        //        lazySingleton = new LazySingleton();
        //    }
        //}
        //return lazySingleton;
    }


    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objectClass = LazySingleton.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();

        //若中途改掉flag为true，反射防御又失效了
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);

        LazySingleton o2 = (LazySingleton) c.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);
    }

}
