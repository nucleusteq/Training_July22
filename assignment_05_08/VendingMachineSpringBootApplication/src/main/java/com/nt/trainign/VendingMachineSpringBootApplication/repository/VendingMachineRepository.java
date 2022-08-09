package com.nt.trainign.VendingMachineSpringBootApplication.repository;


import java.util.List;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;

public interface VendingMachineRepository {
	
	public List<Product> getAllProducts();
	
	public String sellProduct(int id,int money);
	
	public String calculateChange(int sellingPrice,int money);
}
