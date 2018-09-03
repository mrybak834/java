package com.mrybak834.innerClasses;

class DemoClass {


    public void classShow() {
        System.out.println("DemoClass");
    }
}

interface DemoInterface {
    void interfaceShow();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        /**
         * Anonymous class that extends a class
         */
        DemoClass d = new DemoClass() {
            @Override
            public void classShow() {
                System.out.println("Anonymous class extending");
            }
        };

        /**
         * Anonymous class that implements an interface
         */
        DemoInterface i = new DemoInterface() {
            @Override
            public void interfaceShow() {
                System.out.println("Anonymous class implementing");
            }
        };


        d.classShow();
        i.interfaceShow();
    }
}
