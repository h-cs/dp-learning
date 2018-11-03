package com.hcs.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/3 11:42
 */
public abstract class Subject {

    public Subject(Integer num) {
        this.num = num;
    }

    private Integer num;

    List<Observer> observerList = new ArrayList<>();

    /**
     * 获取主题的名称
     * @return
     */
    public abstract String getName();

    /**
     * 注册成为观察者
     */
    public void register(Observer observer) {
        System.out.println("[*] a new observer registered...");
        this.observerList.add(observer);
    }

    /**
     * 解除观察者
     */
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    /**
     * 通知所有观察者
     * @param message
     */
    void notifyObservers(String message) {
        for (Observer observer : observerList) {
            observer.update(this, message);
        }
    }

    /**
     * 更新num，并通知所有观察者
     * @param interval
     */
    public void flush(Integer interval) {
        num += interval;
        notifyObservers(num.toString());
    }

}
