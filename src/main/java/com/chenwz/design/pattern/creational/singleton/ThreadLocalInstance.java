package com.chenwz.design.pattern.creational.singleton;

/**
 * 基于ThreadLocal单例模式
 * 不能保证全局唯一，但是可以保证单个线程下实例唯一
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance
            = new ThreadLocal<ThreadLocalInstance>() {
        /**
         * 匿名类，重写initialValue方法
         */
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }

}
