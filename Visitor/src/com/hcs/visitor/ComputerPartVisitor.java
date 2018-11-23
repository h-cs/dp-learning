package com.hcs.visitor;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:57
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
