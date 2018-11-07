package com.hcs.singleton;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/7 23:18
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    }
}
