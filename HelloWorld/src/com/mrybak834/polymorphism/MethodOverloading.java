package com.mrybak834.polymorphism;

public class MethodOverloading {

    /**
     * Compile-time polymorphism
     * @param args
     */

    public static void main(String[] args){

    }

    public static int calculate(int a, int b){
        return a+b;
    }

    // Overloaded method
    public static int calculate(int a, int b, int c){
        return a+b+c;
    }
}
