package com.geely.design.pattern.creational.singleton;

/**
 * 双重检查懒汉式
 */
public class LazyDoubleCheckSingleton {
    /**
     * 解决下面重排序办法：1、加入volatile关键字，重排序被禁止；2、基于类初始化解决方案，即线程看不到另一个线程的重排序
     * 多线程时，cpu也有共享内存，加了volatile，所有线程都能看到共享内存最新状态，保证内存可见性
     * 用volatile修饰的共享变量，在进行写操作时，会多出一些汇编代码，作用：
     * 将当前处理器缓存行的数据写回系统内存中，这个写回内存的操作会使得其它cpu中缓存了该内存的数据无效，
     * 无效之后又从共享内存中同步数据，保证了内存的可见性，使用了缓存一致性协议
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            //锁定类
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象，但是二三步骤顺序可能会颠倒
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
                    //intra-thread semantics，保证重排序不会改变单线程内程序结果
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
