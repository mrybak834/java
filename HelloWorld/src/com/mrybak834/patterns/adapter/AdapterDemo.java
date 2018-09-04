package com.mrybak834.patterns.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("MP3", "Kush blues");
        player.play("VLC", "Stomp");


    }
}
