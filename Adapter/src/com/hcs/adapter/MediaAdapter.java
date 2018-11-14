package com.hcs.adapter;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/13 22:19
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (VLC.equals(audioType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (MP4.equals(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if (VLC.equals(audioType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (MP4.equals(audioType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
