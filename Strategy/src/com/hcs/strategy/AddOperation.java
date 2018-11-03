package com.hcs.strategy;

/**
 * @description: 加法运算
 * @author: hcs
 * @date: 2018/11/3 10:52
 */
public class AddOperation implements ArithmeticStrategy {

    @Override
    public int doArithmetic(int x, int y) {
        return x + y;
    }
}
