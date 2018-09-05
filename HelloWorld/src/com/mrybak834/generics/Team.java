package com.mrybak834.generics;

import java.util.ArrayList;

public class Team<T extends String> {
    private ArrayList<T> members = new ArrayList<>();

    public void addPlayer(T player) {
        members.add(player);
    }

    public T getFirstPlayer() {
        return members.get(0);
    }
}
