package com.micro.billing_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import com.micro.billing_service.model.Customer;
import com.micro.billing_service.model.Product;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long productId;
    private double amount;

    @Transient
    @JsonInclude
    @JsonProperty
    private Customer customer;

    @Transient
    @JsonInclude
    @JsonProperty
    private Product product;

    @Override
    public String toString() {
        return "Billing{"
                + "id=" + id
                + ", customerId=" + customerId
                + ", productId=" + productId
                + ", amount=" + amount
                + ", customer=" + (customer != null ? customer.toString() : "null")
                + ", product=" + (product != null ? product.toString() : "null")
                + '}';
    }
}
