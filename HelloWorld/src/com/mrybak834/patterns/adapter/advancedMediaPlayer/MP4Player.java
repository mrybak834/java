package com.mrybak834.patterns.adapter.advancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing MP4: " + filename);
    }
}
