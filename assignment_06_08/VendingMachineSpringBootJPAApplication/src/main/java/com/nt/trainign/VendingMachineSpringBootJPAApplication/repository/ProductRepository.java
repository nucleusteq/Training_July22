package com.nt.trainign.VendingMachineSpringBootJPAApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
