package com.chenwz.design.pattern.structural.adapter;

/**
 * 电源适配器
 */
public class PowerAdapter implements DC5 {
    /**
     * 对象适配器模式，优先选择组合
     */
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器...
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V" + "输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
