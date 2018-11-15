package com.hcs.template;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 11:04
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
