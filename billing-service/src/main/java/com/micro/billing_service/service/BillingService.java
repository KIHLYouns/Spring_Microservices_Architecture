package com.micro.billing_service.service;

import com.micro.billing_service.entity.Billing;
import com.micro.billing_service.client.CustomerClient;
import com.micro.billing_service.client.ProductClient;
import com.micro.billing_service.repository.BillingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

    @Autowired
    private CustomerClient customerClient;

    @Autowired
    private ProductClient productClient;

    public Billing checkBillingDetails(Long id) {

        Billing fetchedBilling = billingRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Billing with ID " + id + " not found"));

        // Populate transient fields
        fetchedBilling.setCustomer(customerClient.getCustomerById(fetchedBilling.getCustomerId()));
        fetchedBilling.setProduct(productClient.getProductById(fetchedBilling.getProductId()));

        return fetchedBilling;
    }
}
