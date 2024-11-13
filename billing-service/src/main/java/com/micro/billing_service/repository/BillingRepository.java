package com.micro.billing_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.micro.billing_service.entity.Billing;

@RepositoryRestResource
public interface BillingRepository extends JpaRepository<Billing, Long> {
}
