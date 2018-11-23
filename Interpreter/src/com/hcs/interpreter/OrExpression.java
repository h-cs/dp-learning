package com.hcs.interpreter;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:46
 */
public class OrExpression implements Expression {

    private Expression expressionX = null;
    private Expression expressionY = null;

    public OrExpression(Expression expressionX, Expression expressionY) {
        this.expressionX = expressionX;
        this.expressionY = expressionY;
    }

    @Override
    public boolean interpret(String context) {
        return expressionX.interpret(context) || expressionY.interpret(context);
    }
}
