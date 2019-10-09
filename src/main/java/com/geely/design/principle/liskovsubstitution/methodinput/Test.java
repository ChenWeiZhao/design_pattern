package com.geely.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * 里氏替换原则前置条件
 */
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
