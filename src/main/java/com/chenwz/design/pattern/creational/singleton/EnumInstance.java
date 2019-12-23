package com.chenwz.design.pattern.creational.singleton;

/**
 * 枚举类防御反射攻击，也提供了序列化机制
 * 在static类加载中初始化实例完成
 */
public enum EnumInstance {
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("Geely Print Test");
        }
    };

    /**
     * 声明抽象方法，使得外部能调用到printTest方法
     */
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}
