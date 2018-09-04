package com.mrybak834.patterns.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("CEO");
        Employee WebManager = new Employee("WebManager");
        CEO.add(WebManager);
        WebManager.add(new Employee("Web Developer"));

        for (Employee e : CEO.getEmployees()) {
            System.out.println(e.toString());
        }
    }
}
