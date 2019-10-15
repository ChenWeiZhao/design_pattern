package com.geely.design.pattern.structural.adapter.classadapter;

/**
 * Target有自己具体实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
