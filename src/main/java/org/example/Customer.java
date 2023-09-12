package org.example;

public class Customer {
    //Constructor
    public Customer()
    {
        System.out.println("Welcome");
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Custom initialization method
    public void init() {
        System.out.println("Customer bean is being initialized.");
    }
    // Custom destruction method
    public void destroy() {
        System.out.println("Customer bean is being destroyed.");
    }
}
