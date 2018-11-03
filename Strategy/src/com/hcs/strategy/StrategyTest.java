package com.hcs.strategy;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:15
 */
public class StrategyTest {

    public static final int X = 10;

    public static final int Y = 2;

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.doArithmeticOperation(X, Y));

        context = new Context(new SubstractOperation());
        System.out.println(context.doArithmeticOperation(X, Y));

        context = new Context(new MultiplyOperation());
        System.out.println(context.doArithmeticOperation(X, Y));

        context = new Context(new DivideOperation());
        System.out.println(context.doArithmeticOperation(X, Y));
    }
}
