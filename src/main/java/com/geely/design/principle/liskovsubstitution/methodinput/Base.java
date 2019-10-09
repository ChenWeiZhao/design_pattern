package com.geely.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * 里氏替换原则前置条件
 */
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
