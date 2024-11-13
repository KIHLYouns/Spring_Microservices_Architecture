package com.micro.billing_service.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long Id;
    private String name;
    private double price;
    private Integer availQty;
}