/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>    建筑物类
 *
 * @author chenweizhao
 * 创建日期：2019/10/18 9:58
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.pattern.creational.builder.example;

import java.util.ArrayList;
import java.util.List;

public class Building {

    /** 用来模拟房子组件的堆叠 */
    private List<String> buildingComponents = new ArrayList<String>();

    public void setBasement(String basement) {// 地基
        this.buildingComponents.add(basement);
    }

    public void setWall(String wall) {// 墙体
        this.buildingComponents.add(wall);
    }

    public void setRoof(String roof) {// 房顶
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        StringBuilder buildingStr = new StringBuilder();
        for (int i = buildingComponents.size() - 1; i >= 0; i--) {
            buildingStr.append(buildingComponents.get(i));
        }
        return buildingStr.toString();
    }
}
