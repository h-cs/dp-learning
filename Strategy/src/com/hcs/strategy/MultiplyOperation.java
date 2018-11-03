package com.hcs.strategy;

/**
 * @description: 乘法运算
 * @author: hcs
 * @date: 2018/11/3 10:55
 */
public class MultiplyOperation implements ArithmeticStrategy {

    @Override
    public int doArithmetic(int x, int y) {
        return x * y;
    }
}
