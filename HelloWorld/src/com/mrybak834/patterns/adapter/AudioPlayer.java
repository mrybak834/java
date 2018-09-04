package com.mrybak834.patterns.adapter;

import com.mrybak834.patterns.adapter.mediaPlayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equals("MP3")){
            System.out.println("Playing MP3: " + filename);
        } else if (audioType.equals("VLC") || audioType.equals("MP4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }
    }
}
