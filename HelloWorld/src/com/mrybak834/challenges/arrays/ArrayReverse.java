package com.mrybak834.challenges.arrays;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args){
        int[] array = new int[]{3,6,26,5,9};
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));


    }

    private static void reverse(int[] array) {
        int length = array.length;

        for (int i = 0; i < length / 2; ++i) {
            int swapPosition = length - i - 1;
            int temp = array[swapPosition];
            array[swapPosition] = array[i];
            array[i] = temp;
        }
    }

}
