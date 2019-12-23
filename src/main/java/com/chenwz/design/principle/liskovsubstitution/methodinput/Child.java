package com.chenwz.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * 里氏替换原则前置条件
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    /**
     * interestAnsVo
     */
    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}
