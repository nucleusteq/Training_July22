package com.nt.training.vendormachine.VendingMachine.service;

import java.util.List;

import com.nt.training.vendormachine.VendingMachine.model.Product;
import com.nt.training.vendormachine.VendingMachine.model.ReturnProduct;

public interface VendingMachineService {
	public List<Product> getAllProducts();

	public ReturnProduct buyProduct(Integer id, Integer amount);
}
