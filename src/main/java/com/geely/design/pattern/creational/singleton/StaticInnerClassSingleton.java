package com.geely.design.pattern.creational.singleton;

/**
 * 静态内部类单例模式 非构造线程，看不到构造重排序的情况：
 * 类被初始化：
 * 1、A类型的实例被创建
 * 2、A类中声明的静态方法被调用
 * 3、A类中声明的静态成员被赋值
 * 4、A类中声明的静态成员被使用并且这个成员不是常量成员
 * 5、A类是一个顶级类
 * <p>
 * 1、线程0、线程1试图获取对象的初始化锁时，只有一个线程可以获取到锁
 * 2、线程0 获取到该锁
 * 3、执行静态内部类的初始
 * 4、即使内部发生指令重排序，线程1也是无法看到的
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }


}
