package com.micro.billing_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.micro.billing_service.model.Customer;

@FeignClient(name = "customer-service")
public interface CustomerClient {
    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable("id") Long Id);
}