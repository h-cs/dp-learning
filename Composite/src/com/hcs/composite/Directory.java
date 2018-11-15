package com.hcs.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 23:28
 */
public class Directory extends Node {

    List<Node> nodeList = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void addNode(Node node) throws Exception {
        nodeList.add(node);
    }

    @Override
    void display() {
        System.out.println(name);
        for (Node node : nodeList) {
            node.display();
        }
    }
}
