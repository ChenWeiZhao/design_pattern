package com.geely.design.pattern.behavioral.visitor;

/**
 * Created by geely
 */
public abstract class Course {
    private String name;

    /**
     * 是否接受访问者的访问，操作数据
     *
     * @param visitor 访问者
     */
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
