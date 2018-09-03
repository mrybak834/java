package com.mrybak834.challenges.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMinElement {

    private static final ArrayList<Integer> userIntegers = new ArrayList<Integer>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readIntegers(5);
        int min = findMin(userIntegers);

        System.out.println("Minimum integer is " + min);
        scanner.close();
    }


    private static void readIntegers(int count) {
        for (int i = 0; i < count; ++i) {
            System.out.println("Enter number: ");
            while(!scanner.hasNextInt()){
                System.out.println("Enter number: ");
                scanner.nextLine();
            }

            userIntegers.add(scanner.nextInt());
            scanner.nextLine();
        }
    }

    private static int findMin(ArrayList<Integer> userIntegers) {
        if (userIntegers.size() == 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (Integer i : userIntegers) {
            if (i < min) min = i;
        }

        return min;
    }
}
