package com.nt.training.vendormachine.VendingMachine.repository.impl;

import java.util.List;

import com.nt.training.vendormachine.VendingMachine.model.Product;
import com.nt.training.vendormachine.VendingMachine.model.ReturnProduct;

public interface VendingMachineRepository {
	public List<Product> getAllProducts();

	public ReturnProduct buyProduct(Integer id, Integer amount);
}
