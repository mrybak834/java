package com.mrybak834.patterns.adapter;

import com.mrybak834.patterns.adapter.advancedMediaPlayer.AdvancedMediaPlayer;
import com.mrybak834.patterns.adapter.advancedMediaPlayer.MP4Player;
import com.mrybak834.patterns.adapter.advancedMediaPlayer.VLCPlayer;
import com.mrybak834.patterns.adapter.mediaPlayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equals("VLC")) {
            advancedMediaPlayer = new VLCPlayer();
        } else if (type.equals("MP4")) {
            advancedMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equals("VLC")) {
            advancedMediaPlayer.playVLC(filename);
        } else if (audioType.equals("MP4")){
            advancedMediaPlayer.playMp4(filename);
        }
    }
}
