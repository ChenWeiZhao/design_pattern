package com.geely.design.principle.liskovsubstitution.methodoutput;

/**
 * 里氏替换原则后置条件
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());

    }
}
