package com.hcs.state;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/16 17:45
 */
public class GumballMachine {

    private State soldOutState;
    private State noCoinState;
    private State hasCoinState;
    private State soldState;

    private State state = soldOutState;
    int count = 0;

    public GumballMachine(int gumballCount) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        this.count = gumballCount;
        if (gumballCount > 0) {
            state = noCoinState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(State noCoinState) {
        this.noCoinState = noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public void setHasCoinState(State hasCoinState) {
        this.hasCoinState = hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void releaseBall() {
        System.out.println("释放糖果.");
        if (count != 0) {
            count -= 1;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.prepare();
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "soldOutState=" + soldOutState +
                ", noCoinState=" + noCoinState +
                ", hasCoinState=" + hasCoinState +
                ", soldState=" + soldState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}
