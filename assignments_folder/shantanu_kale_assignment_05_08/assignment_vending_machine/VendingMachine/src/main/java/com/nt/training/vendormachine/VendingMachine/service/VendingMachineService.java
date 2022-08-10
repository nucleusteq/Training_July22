package com.nt.training.vendormachine.VendingMachine.service;

import java.util.List;

import com.nt.training.vendormachine.VendingMachine.model.Product;

public interface VendingMachineService {
	public List<Product> getAllProducts();

	public Product buyProduct(Integer id, Integer amount);
}
