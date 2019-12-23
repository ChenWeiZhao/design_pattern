package com.chenwz.design.pattern.structural.adapter;

/**
 * 220V交流电
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
