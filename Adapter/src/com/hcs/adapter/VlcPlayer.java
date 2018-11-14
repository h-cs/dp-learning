package com.hcs.adapter;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/13 22:17
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
