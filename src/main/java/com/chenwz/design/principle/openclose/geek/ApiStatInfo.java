/**
 * ***************************************************************************
 * 工程：IntelliJ IDEA v1.0
 * All Rights Reserved.
 * <p>       类
 *
 * @author chenweizhao
 * 创建日期：2020/1/31 16:03
 * 版 本 号： 1.0
 * <p>
 * ****************************************************************************
 */
package com.chenwz.design.principle.openclose.geek;

import lombok.Data;

@Data
public class ApiStatInfo {//省略constructor/getter/setter方法
    private Api api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount; // 改动一：添加新字段


}

class Api {
    public long getMaxErrorCount(){
        return -999L;
    }

    public long getMaxTps(){
        return 999L;
    }
}
