/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/17 10:11
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.geely.design.pattern.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 */
public class Folder extends Node {
    /**
     * 重点在于这里模糊了其下文件夹或文件的概念，
     * 也就是说这个文件夹既可以包含子文件夹，又可以包含文件
     */
    private List<Node> childrenNodes = new ArrayList<Node>();

    public Folder(String name) {
        //调用父类“节点”的构造方法命名。
        super(name);
    }

    /**
     * 增加后续子节点方法
     *
     * @param child
     */
    @Override
    protected void add(Node child) {
        //可以添加子节点
        childrenNodes.add(child);
    }

    @Override
    protected void print(int space) {
        //调用父类共通的print方法列出自己的名字。
        System.out.print("--");
        super.print(space);
        //之后列出的子节点前，空格数要增加一个了。
        space++;
        for (Node childrenNode : childrenNodes) {
            //调用子节点的print方法。
            childrenNode.print(space);
        }

    }
}
