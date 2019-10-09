package com.geely.design.principle.compositionaggregation;

/**
 * 合成（组合）/聚合复用原则
 */
public abstract class DBConnection {
//    public String getConnection(){
//        return "MySQL数据库连接";
//    }
    public abstract String getConnection();
}
