package com.mrybak834.innerClasses;

public class StaticNestedClass {
    public static void main(String[] args){
        Candy c = new Candy();
    }

    static class Candy {
        private static int number;

        Candy(){
            number = 2;
            System.out.println("number");
        }

        private void print() {

        }
    }
}

class Tester {
    Tester() {
        StaticNestedClass.Candy c = new StaticNestedClass.Candy();
    }
}

