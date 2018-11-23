package com.hcs.interpreter;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:45
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
