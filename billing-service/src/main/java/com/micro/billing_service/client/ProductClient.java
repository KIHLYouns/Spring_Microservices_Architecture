package com.micro.billing_service.client;

import com.micro.billing_service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "inventory-service", url = "http://localhost:8082")
public interface ProductClient {

    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @PostMapping("/products")
    Product createProduct(@RequestBody Product product);
}