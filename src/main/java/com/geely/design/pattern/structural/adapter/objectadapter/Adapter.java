package com.geely.design.pattern.structural.adapter.objectadapter;

/**
 * 适配者
 */
public class Adapter implements Target{
    /**
     * 通过组合
     */
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
