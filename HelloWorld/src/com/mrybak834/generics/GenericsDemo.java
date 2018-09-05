package com.mrybak834.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Team<String> myteam = new Team<>();

        myteam.addPlayer("hello");
        System.out.println(myteam.getFirstPlayer());


    }
}
