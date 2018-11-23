package com.hcs.interpreter;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 16:44
 */
public interface Expression {
    boolean interpret(String context);
}
