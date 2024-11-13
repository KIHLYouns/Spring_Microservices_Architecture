package com.micro.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.micro.inventory_service.entity.Product;

@RepositoryRestResource
public interface InventoryRepository extends JpaRepository<Product, Long> {
}
