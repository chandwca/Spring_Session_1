package org.example.model;

public class Customer {
    private String name;
    //Constructor
    public Customer(String name)
    {
        this.name=name;
        System.out.println("Welcome "+name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
