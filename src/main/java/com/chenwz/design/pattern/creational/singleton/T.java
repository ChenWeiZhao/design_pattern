package com.chenwz.design.pattern.creational.singleton;

/**
 * Created by geely
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + lazySingleton);

        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        //StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();;

        ContainerSingleton.putInstance("object",new Object());
        Object instance = ContainerSingleton.getInstance("object");

        ThreadLocalInstance threadInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+threadInstance);

    }
}
