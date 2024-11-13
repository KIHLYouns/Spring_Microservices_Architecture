package com.micro.billing_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import com.micro.billing_service.model.Customer;
import com.micro.billing_service.model.Product;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Long customerId;
    private Long productId;
    private double amount;

    @Transient
    private Customer customer;

    @Transient
    private Product product;
}