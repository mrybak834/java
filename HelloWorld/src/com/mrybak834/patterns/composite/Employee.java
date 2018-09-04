package com.mrybak834.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Employee> employees;

    public Employee(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void remove(Employee e) {
        employees.remove(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String toString() {
        return "Employee: " + name;
    }
}
