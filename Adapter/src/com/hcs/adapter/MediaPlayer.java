package com.hcs.adapter;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/13 22:16
 */
public interface MediaPlayer {

    String VLC = "vlc";
    String MP3 = "mp3";
    String MP4 = "mp4";

    void play(String audioType, String fileName);
}
