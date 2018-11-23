package com.hcs.memento;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:20
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
