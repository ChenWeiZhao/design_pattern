package com.chenwz.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

/**
 * 里氏替换原则后置条件
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message","子类method被执行");
        return hashMap;
    }
}
