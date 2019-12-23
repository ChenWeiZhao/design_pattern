package com.chenwz.design.pattern.structural.bridge;

/**
 * 抽象层
 * 中国农业银行
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    /**
     * 传入什么account就返回什么account
     */
    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //不要把具体实现自己完成，而是委托给account实现
        //只有通过具体的委托，bank里的方法是不用动的
        account.openAccount();
        return account;
    }
}
