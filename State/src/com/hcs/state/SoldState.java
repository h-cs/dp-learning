package com.hcs.state;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 17:52
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("稍等，正在给您发糖呢.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("糖果已售给您，无法退款了");
    }

    @Override
    public void turnCrank() {
        System.out.println("您已经拉过一次手柄了，请勿重复操作");
    }

    @Override
    public void prepare() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("机器里已经没有糖果了.");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
