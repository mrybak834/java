package com.mrybak834.basics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] original = new int[]{20,50,5,6,120};

        int[] copy = Arrays.copyOf(original, original.length);

        copy[0] = 10;
    }
}
