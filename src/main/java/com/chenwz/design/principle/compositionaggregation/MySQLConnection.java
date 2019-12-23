package com.chenwz.design.principle.compositionaggregation;

/**
 * 合成（组合）/聚合复用原则
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
