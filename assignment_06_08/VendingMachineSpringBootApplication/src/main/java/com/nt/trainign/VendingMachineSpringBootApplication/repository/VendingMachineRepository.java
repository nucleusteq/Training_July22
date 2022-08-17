package com.nt.trainign.VendingMachineSpringBootApplication.repository;


import java.util.HashMap;
import java.util.List;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachineOutputModel;

public interface VendingMachineRepository {
	
	public List<Product> getAllProducts();
	
	public VendingMachineOutputModel sellProduct(int id,int money);
	
	public HashMap<String,Integer> calculateChange(int sellingPrice,int money);
}
