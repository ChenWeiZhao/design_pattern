package com.geely.design.pattern.structural.proxy.db;

/**
 * DataSource上下文
 */
public class DataSourceContextHolder {
    /**
     * ThreadLocal线程之间是隔离的
     * 存放的是DataSource的Beanname，即db0或db1
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBType(){
        return (String)CONTEXT_HOLDER.get();
    }
    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }


}
