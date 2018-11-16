package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 17:42
 */
public interface State {

    /**
     * 投币
     */
    void insertCoin();

    /**
     * 吐币
     */
    void ejectCoin();

    /**
     * 拉动手柄
     */
    void turnCrank();

    /**
     * 机器准备糖果
     */
    void prepare();
}
