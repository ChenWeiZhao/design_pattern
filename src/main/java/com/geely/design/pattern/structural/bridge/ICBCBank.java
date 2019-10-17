package com.geely.design.pattern.structural.bridge;

/**
 * 抽象层
 * 中国工商银行
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //不要把具体实现自己完成，而是委托给account实现
        //只有通过具体的委托，bank里的方法是不用动的
        account.openAccount();
        return account;
    }
}
