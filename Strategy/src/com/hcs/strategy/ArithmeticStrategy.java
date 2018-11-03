package com.hcs.strategy;

/**
 * @description: 四则运算策略
 * @author: hcs
 * @date: 2018/11/3 10:50
 */
public interface ArithmeticStrategy {

    /**
     * 执行四则运算
     *
     * @param x
     * @param y
     * @return
     */
    int doArithmetic(int x, int y);
}
