package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the "person" bean from the Spring container
        Customer customer = (Customer) context.getBean("person");

        // Get and display the Customer's name
        System.out.println("Customer's name: " + customer.getName());
    }
}