package com.mrybak834.encapsulation;

/**
 * Encapsulation is just Putting data into a single unit,
 * to make more sense and limit outside object access.
 */
public class Printer {
    private int toner = 100;
    private int numPagesPrinted = 0;
    private boolean isDuplexPrinter;

    Printer(int toner, boolean isDuplexPrinter) {
        if (toner < 100 && toner >= 0) this.toner = toner;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int amount) {
        if (toner + amount > 100) {
            System.out.println("Too much toner!");
            return;
        }

        toner += amount;
    }

    public void print(String page) {
        System.out.println("Printing " + page);

        ++numPagesPrinted;
    }

}

class Main {
    public static void main(String[] args){
        Printer p = new Printer(99, true);

        p.fillToner(20);
        p.print("Works");
    }
}