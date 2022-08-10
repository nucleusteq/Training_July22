package com.nt.training.vendormachine.VendingMachine.repository.impl;

import java.util.List;

import com.nt.training.vendormachine.VendingMachine.model.Product;

public interface VendingMachineRepository {
	public List<Product> getAllProducts();

	public Product buyProduct(Integer id, Integer amount);
}
