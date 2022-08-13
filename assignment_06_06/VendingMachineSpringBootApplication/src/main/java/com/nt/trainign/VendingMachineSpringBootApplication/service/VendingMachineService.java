package com.nt.trainign.VendingMachineSpringBootApplication.service;

import java.util.List;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;

public interface VendingMachineService {

	public List<Product> getAllProducts();
	
	public String sellProduct(int id,int money);
}
