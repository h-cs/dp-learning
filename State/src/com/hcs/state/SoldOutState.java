package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 18:01
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("糖果已售罄，请勿投币");
    }

    @Override
    public void ejectCoin() {
        System.out.println("您还没投币呢");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已售罄，请勿拉动手柄");
    }

    @Override
    public void prepare() {
        System.out.println("糖果已售罄，无法准备");
    }
}
