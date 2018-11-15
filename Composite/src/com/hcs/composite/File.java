package com.hcs.composite;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 23:27
 */
public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println(name);
    }
}
