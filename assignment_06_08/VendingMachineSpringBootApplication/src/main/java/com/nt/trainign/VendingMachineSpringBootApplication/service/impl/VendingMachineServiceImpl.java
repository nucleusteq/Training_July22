package com.nt.trainign.VendingMachineSpringBootApplication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachineOutputModel;
import com.nt.trainign.VendingMachineSpringBootApplication.repository.impl.VendingMachineRepositoryImpl;
import com.nt.trainign.VendingMachineSpringBootApplication.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService {

	@Autowired
	VendingMachineRepositoryImpl vendingMachineRepository;

	@Override
	public List<Product> getAllProducts() {
		
		return vendingMachineRepository.getAllProducts();
	}

	@Override
	public VendingMachineOutputModel sellProduct(int id, int money) {
		
		return vendingMachineRepository.sellProduct(id, money);
	} 
	
	
}
