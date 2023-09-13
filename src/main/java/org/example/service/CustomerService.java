package org.example.service;

import org.example.model.Customer;

public class CustomerService {
    private Customer customer;

    // Constructor-based DI
    public CustomerService(String name)
    {
        this.customer = new Customer(name);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    // Custom initialization method
    public void init() {
        System.out.println("CustomerService bean is being initialized.");
    }
    // Custom destruction method
    public void destroy() {
        System.out.println("Customer Service bean is being destroyed.");
    }
}
