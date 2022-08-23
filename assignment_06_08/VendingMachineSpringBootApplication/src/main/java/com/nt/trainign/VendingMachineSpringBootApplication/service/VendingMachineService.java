package com.nt.trainign.VendingMachineSpringBootApplication.service;

import java.util.List;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachineOutputModel;

public interface VendingMachineService {

	public List<Product> getAllProducts();
	
	public VendingMachineOutputModel sellProduct(int id,int money);
}
