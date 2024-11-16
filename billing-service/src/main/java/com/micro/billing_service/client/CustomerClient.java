package com.micro.billing_service.client;

import com.micro.billing_service.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "customer-service", url = "http://localhost:8081")
public interface CustomerClient {

    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable("id") Long id);

    @PostMapping("/customers")
    Customer createCustomer(@RequestBody Customer customer);
}