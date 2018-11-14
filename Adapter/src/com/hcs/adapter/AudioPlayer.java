package com.hcs.adapter;

/**
 * @description:
 * @author: hcs
 * @date: 2018/11/13 22:22
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (MP3.equals(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (VLC.equals(audioType) || MP4.equals(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
