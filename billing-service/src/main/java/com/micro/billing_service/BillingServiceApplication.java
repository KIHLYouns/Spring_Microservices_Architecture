package com.micro.billing_service;

import com.micro.billing_service.client.CustomerClient;
import com.micro.billing_service.client.ProductClient;
import com.micro.billing_service.model.Customer;
import com.micro.billing_service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    @Autowired
    private CustomerClient customerClient;

    @Autowired
    private ProductClient productClient;

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner testFeignClients() {
        return args -> {
            // Test CustomerClient
            Customer customer = customerClient.getCustomerById(1L);
            System.out.println("Customer: " + customer);

            // Test ProductClient
            Product product = productClient.getProductById(1L);
            System.out.println("Product: " + product);
        };
    }
}
