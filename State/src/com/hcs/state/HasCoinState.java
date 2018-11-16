package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 17:49
 */
public class HasCoinState implements State {
    GumballMachine gumballMachine;

    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("您已经投过币了.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("吐币中...");
        gumballMachine.setState(gumballMachine.getNoCoinState());
        System.out.println("吐币完成...");
    }

    @Override
    public void turnCrank() {
        System.out.println("您拉动了手柄，正在给您发糖...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void prepare() {
        System.out.println("机器中已经有糖果了.");
    }
}
