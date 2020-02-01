/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/1/31 17:14
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.interfacesegregation.geek;

import java.util.Map;

public class RedisConfig implements Updater, Viewer {
    /** ...省略其他属性和方法... */

    public RedisConfig(ConfigSource configSource){

    }

    @Override
    public void update() {
        //...
    }

    @Override
    public String outputInPlainText() {
        //...
        return "";
    }

    @Override
    public Map<String, String> output() {
        //...
        return null;
    }
}