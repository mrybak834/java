package com.mrybak834.innerClasses;

public class MethodLocalInnerClass {

    public static void main(String[] args) {
        class Candy {
            private String name;

            private Candy(String name) {
                this.name = name;
            }

            private void print() {
                System.out.println("Candy is " + name);
            }
        }

        Candy c = new Candy("Ice Cream");
        c.print();
    }
}