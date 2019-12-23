package com.chenwz.design.pattern.structural.bridge;

/**
 * 实现层
 * 桥接模式是只实现与抽象分离，实现正式Account的2个接口实现
 */
public interface Account {
    /**
     * 打开账号
     */
    Account openAccount();

    /**
     * 查看账号类型
     */
    void showAccountType();

}
