package org.example;
import org.example.model.Customer;
import org.example.service.CustomerService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring configuration
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        Retrieves the "customerService" bean of type "CustomerService"
        CustomerService customerService = context.getBean("customerService", CustomerService.class);
//Display the customer name from the customer Service
        System.out.println("The Customer's name is "+ customerService.getCustomer().getName());
        // Close the Spring container
        context.registerShutdownHook();
    }


}