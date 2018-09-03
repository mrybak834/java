package com.mrybak834.parameterPassing;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[]{1,2,3};
        String word = "hello";
        Dog d = new Dog();

        /**
         * Everything changes, except string, which is immutable
         */
        modifier(x, y, word, d);
        System.out.println(x);
        System.out.println(y[0]);
        System.out.println(word);
        System.out.println(d.getPaws());

        d.modifier(x, y, word, d);
        System.out.println(x);
        System.out.println(y[0]);
        System.out.println(word);
        System.out.println(d.getPaws());
    }

    private static void modifier(int x, int[] y, String word, Dog d) {
        x = 5;
        y[0] = 6;
        word = "changed";
        d.setPaws(10);
    }
}

class Dog {
    private int paws;

    Dog() {
        paws = 2;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getPaws() {
        return paws;
    }

    public void modifier(int x, int[] y, String word, Dog d) {
        x = 0;
        y[0] = 0;
        word = "0";
        this.setPaws(0);
    }
}