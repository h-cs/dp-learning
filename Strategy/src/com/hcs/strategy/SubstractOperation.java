package com.hcs.strategy;

/**
 * @description: 减法运算
 * @author: hcs
 * @date: 2018/11/3 10:54
 */
public class SubstractOperation implements ArithmeticStrategy {

    @Override
    public int doArithmetic(int x, int y) {
        return x - y;
    }
}
