package com.hcs.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018-11-23 17:22
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
