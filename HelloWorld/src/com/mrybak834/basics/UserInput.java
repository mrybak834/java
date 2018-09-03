package com.mrybak834.basics;

import java.util.Scanner;

public class UserInput {

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    /**
     * Be careful:
     * Entering input requires pressing enter, which triggers a nextLine();
     * So entering an int will trigger nextInt and nextLine at the same time
     * Enter a blank nextLine() after any other input type, ex:
     *
     * int age = scanner.nextInt();
     * scanner.nextLine();
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        boolean hasNextInt = scanner.hasNextInt();
        int age = hasNextInt ? scanner.nextInt() : 0;
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name);
        System.out.println(age);

        scanner.close();
    }
}
