package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 18:03
 */
public class StateTest {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        System.out.println("-----------------");

        System.out.println(gumballMachine);

        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        System.out.println("-----------------");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        System.out.println("-----------------");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        System.out.println("-----------------");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();
        System.out.println("-----------------");
        gumballMachine.insertCoin();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

    }
}
