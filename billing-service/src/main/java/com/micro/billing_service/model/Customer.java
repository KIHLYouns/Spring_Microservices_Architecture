package com.micro.billing_service.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long Id;
    private String name;
    private String email;
}