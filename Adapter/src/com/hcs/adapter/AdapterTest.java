package com.hcs.adapter;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/13 22:25
 */
public class AdapterTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(MediaPlayer.MP3, "beyond the horizon.mp3");
        audioPlayer.play(MediaPlayer.MP4, "alone.mp4");
        audioPlayer.play(MediaPlayer.VLC, "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
