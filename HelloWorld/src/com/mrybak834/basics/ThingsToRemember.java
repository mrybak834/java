package com.mrybak834.basics;

import java.util.ArrayList;

public class ThingsToRemember {

    /**
     * static: Doesn't rely on an instance of the object
     * final: const
     */
    private static final String MY_STRING = "com.mrybak834.Hello";

    public static void main(String[] args) {
        arrayList();
    }

    public static void Operators() {
        /**
         * Operators
         * +, -, /, %, &&, !, ++, +=, ||, etc
         */
    }

    public static void KeywordsAndExpressionsAndLiterals() {
        /**
         * Keyword: int
         * Expression: myInt = 2;
         * Literal: 2
         */
        int myInt = 2;

        /**
         * Expression: "Text"
         */
        System.out.println("Text");
    }

    public static int reverseANumber(int number) {
        int reversed = 0;
        int lastDigit = 0;
        int num = Math.abs(number);

        /**
         * Take the last digit, place it in the new number
         * multiply new number by 10 to shift it left
         * divide old number by 10 to remove last digit
         * repeat until old number is 0
         */
        while (num != 0){
            lastDigit = num % 10;
            reversed += lastDigit;
            reversed *= 10;
            num /= 10;
        }

        if (number < 0) return reversed * -1;
        return reversed;
    }

    public static void wrapperClasses() {
        /**
         * A wrapper class is a class that acts on primitives
         * Integer is a wrapper class
         */
        int number = Integer.parseInt("20");
    }

    public static void constructors() {
        /**
         * Java doesn't create a default constructor if there
         * is a different one and no default defined
         */
    }

    public static void thisSyntax() {
        /**
         * this.var :       variables of the object
         * this(params) :   calls a differentconstructor of the current class
         *                  from the default constructor. Must be the first line.
         */
    }

    public static void gettersAndSetters() {
        /**
         * Don't call getters or setters in constructors. Inheritance + creation issues.
         */
    }

    public static void arrayList() {
        ArrayList<int[]> testList = new ArrayList<>();
        int[] testArr = new int[]{2,3,4};
        testList.add(testArr);

        // Performs a shallow copy, you have to deep copy yourself
        ArrayList<int[]> testCopy = new ArrayList<>(testList);
        testCopy.get(0)[0] = 9;

        System.out.println(testArr[0]);
        System.out.println(testList.get(0)[0]);
        System.out.println(testCopy.get(0)[0]);
    }
}
