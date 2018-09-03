package com.mrybak834.patterns;

public class Factory {
    public static void main(String[] args){
        Contact marek = Contact.CreateContact("Marek", "234");
        Contact kyle = Contact.CreateContact("Kyle", "616");

        System.out.println(marek.getName());
        System.out.println(kyle.getName());
    }
}

class Contact {
    private String name;
    private String number;

    private Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    /**
     * Factory
     */
    public static Contact CreateContact(String name, String number) {
        return new Contact(name, number);
    }
}
