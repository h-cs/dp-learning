package com.hcs.strategy;

/**
 * @description: 除法运算
 * @author: hcs
 * @date: 2018/11/3 10:56
 */
public class DivideOperation implements ArithmeticStrategy {
    @Override
    public int doArithmetic(int x, int y) {
        return x / y;
    }
}
