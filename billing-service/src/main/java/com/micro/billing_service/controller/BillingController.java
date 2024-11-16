package com.micro.billing_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.micro.billing_service.entity.Billing;
import com.micro.billing_service.service.BillingService;

@RestController
@RequestMapping("/billings")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @Autowired
    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<Billing> getBillingById(@PathVariable("id") Long id) {
        try {
            Billing billing = billingService.checkBillingDetails(id);
            return new ResponseEntity<>(billing, HttpStatus.OK);
        } catch (RuntimeException e) {
            // Log the exception (consider using a logging framework)
            System.err.println("Error fetching Billing: " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // Log the exception (consider using a logging framework)
            System.err.println("Unexpected error: " + e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
