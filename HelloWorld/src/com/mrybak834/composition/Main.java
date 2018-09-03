package com.mrybak834.composition;

public class Main {
    public static void main(String[] args){
        Guitar g = new Guitar(new Strings(6));

        System.out.println(g.getStringAmount());
    }
}

class Guitar {
    private Strings theStrings;

    public Guitar (Strings theStrings) {
        this.theStrings = theStrings;
    }

    public void setTheStrings(int amount) {
        theStrings.setAmount(amount);
    }

    public int getStringAmount() {
        return theStrings.getAmount();
    }
}


class Strings {
    private int amount;

    Strings(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}