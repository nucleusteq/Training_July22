package com.nt.training.VendingMachine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;

public interface VendingMachineRepository extends JpaRepository<VendingMachine, Integer>{

//	List<VendingMachine> getAllProducts();
//
//	ResponseClass buyProduct(Integer id, Integer amount);

}
