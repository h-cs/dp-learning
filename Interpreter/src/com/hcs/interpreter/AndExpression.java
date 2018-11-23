package com.hcs.interpreter;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:47
 */
public class AndExpression implements Expression {

    private Expression expressionX = null;
    private Expression expressionY = null;

    public AndExpression(Expression expressionX, Expression expressionY) {
        this.expressionX = expressionX;
        this.expressionY = expressionY;
    }

    @Override
    public boolean interpret(String context) {
        return expressionX.interpret(context) && expressionY.interpret(context);
    }
}
