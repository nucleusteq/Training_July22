package com.nt.trainign.VendingMachineSpringBootJPAApplication.service;

import java.util.HashMap;
import java.util.List;

import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootJPAApplication.model.VendingMachineOutputModel;

public interface VendingMachineService {

	public List<Product> getAllProducts();
	
	public VendingMachineOutputModel sellProduct(int id,int money);
	
	public HashMap<String,Integer> calculateChange(int sellingPrice, int money);
}
