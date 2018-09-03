package com.mrybak834.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterators {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(2,3,4,30,629,8));

        printList(list);
    }

    private static void printList(LinkedList<Integer> list) {
        Iterator<Integer> i = list.iterator();

        /**
         * ListIterator is just a more useful iterator for list.
         * The cursor sits in between entries, so you need to check direction
         * Allows previous, compare, etc.
         */
        ListIterator<Integer> iPowerful = list.listIterator();


        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // SAME THING, USES ITERATOR NATIVELY
        // better to use iterator though, since you can get reversed ones

        for (int num : list){

        }

    }
}
