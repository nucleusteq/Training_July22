package com.nt.training.VendingMachine.repository;

import java.util.List;

import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;

public interface VendingMachineRepository {

	List<VendingMachine> getAllProducts();

	ResponseClass buyProduct(Integer id, Integer amount);

}
