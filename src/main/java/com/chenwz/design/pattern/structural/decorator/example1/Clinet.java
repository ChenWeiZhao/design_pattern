/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2019/10/24 19:41
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.structural.decorator.example1;

public class Clinet {
    public static void main(String[] args) {
        Person laowang = new LaoWang();
        laowang = new Jacket(laowang);
        laowang = new Hat(laowang);
        laowang.show();

        System.out.println("买单，老王总共消费："+laowang.cost());
    }
}
