package com.hcs.singleton;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 22:33
 */
public class Singleton {

    public volatile static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
