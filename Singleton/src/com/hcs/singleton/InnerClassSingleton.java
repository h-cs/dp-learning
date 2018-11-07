package com.hcs.singleton;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 23:15
 */
public class InnerClassSingleton {
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {}

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
