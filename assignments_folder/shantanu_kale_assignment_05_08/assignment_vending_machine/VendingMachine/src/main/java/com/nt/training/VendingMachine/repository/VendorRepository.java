package com.nt.training.VendingMachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.training.VendingMachine.vendor.Vendor;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long>{

}
