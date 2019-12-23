/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/17 10:07
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.structural.composite.example;

public abstract class Node {
    /**
     * 节点命名：包括文件或文件夹
     */
    protected String name;

    /**
     * 构造节点，传入节点名。
     */
    public Node(String name) {
        this.name = name;
    }

    /**
     * 增加后续子节点方法
     */
    protected abstract void add(Node child) throws Exception;

    protected void print(int space){
        for (int i = 0; i < space; i++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }

    protected void print(){
        this.print(0);
    }
}
