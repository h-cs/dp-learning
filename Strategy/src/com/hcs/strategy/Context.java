package com.hcs.strategy;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:12
 */
public class Context {

    private ArithmeticStrategy arithmeticStrategy;

    public Context(ArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public int doArithmeticOperation(int x, int y) {
        return arithmeticStrategy.doArithmetic(x, y);
    }
}
