/**
 * 文件名称: StrategyHandler.java
 * 文件描述:
 * 版权所有: 版权所有(C)2016-
 * 公    司: 金证财富南京科技有限公司
 * 内容摘要:
 * 其他说明:
 * 创建日期： 2021/1/28 11:29
 * 完成日期：
 * 修改记录1:
 * <pre>
 *    修改日期：
 *    版 本 号：
 *    修 改 人：
 *    修改内容：
 * </pre>
 * <p>修改记录2：…</p>
 *
 * @version 1.0
 * @author chenwz@szkingdom.com
 */
package com.chenwz.design.pattern.behavioral.strategy.strategyrouter;


/**
 * @author
 * @date
 */
public interface StrategyHandler<T, R> {

    @SuppressWarnings("rawtypes")
    StrategyHandler DEFAULT = t -> null;

    /**
     * apply strategy
     *
     * @param param
     * @return
     */
    R apply(T param);
}