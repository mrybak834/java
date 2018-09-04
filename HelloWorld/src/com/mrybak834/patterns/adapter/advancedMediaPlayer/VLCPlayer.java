package com.mrybak834.patterns.adapter.advancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVLC(String filename) {
        System.out.println("Playing VLC: " + filename);
    }

    @Override
    public void playMp4(String filename) {
    }
}
