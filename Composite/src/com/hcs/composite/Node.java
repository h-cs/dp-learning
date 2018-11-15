package com.hcs.composite;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 23:25
 */
public abstract class Node {
    protected String name;

    public Node(String name) {
        this.name = name;
    }

    public void addNode(Node node) throws Exception {
        throw new Exception("Invalid Operation!");
    }

    abstract void display();
}
