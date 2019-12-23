/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/17 10:15
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.structural.composite.example;

public class File extends Node{

    public File(String name) {
        super(name);
    }

    /**
     * 增加后续子节点方法
     *  文件不能添加子节点
     * @param child
     */
    @Override
    protected void add(Node child) throws Exception {
        throw new Exception("不能添加子节点");
    }

    @Override
    protected void print(int space) {
        super.print(space);
    }
}
