package com.geely.design.principle.compositionaggregation;

/**
 * 合成（组合）/聚合复用原则
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
