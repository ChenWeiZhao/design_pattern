package com.chenwz.design.pattern.structural.bridge;

/**
 * 抽象层
 * 银行抽象类
 */
public abstract class Bank {
    /**
     * 通过组合方式，使用了桥接模式的接口，这就是核心
     * 只有子类能拿到account
     */
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 与Account的方法一样
     * 抽象类Bank的行为委托给Account接口
     */
    abstract Account openAccount();

}
