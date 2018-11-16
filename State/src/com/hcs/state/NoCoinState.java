package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 17:44
 */
public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("投入硬币.");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("您还没投币呢...");
    }

    @Override
    public void turnCrank() {
        System.out.println("没投币不给糖噢~");
    }

    @Override
    public void prepare() {
        System.out.println("机器中已经有糖果了.");
    }
}
