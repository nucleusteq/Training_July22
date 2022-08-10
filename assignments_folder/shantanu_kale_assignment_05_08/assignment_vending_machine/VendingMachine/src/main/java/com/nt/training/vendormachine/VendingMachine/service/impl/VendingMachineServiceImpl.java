package com.nt.training.vendormachine.VendingMachine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.vendormachine.VendingMachine.model.Product;
import com.nt.training.vendormachine.VendingMachine.repository.impl.VendingMachineRepository;
import com.nt.training.vendormachine.VendingMachine.service.VendingMachineService;
@Service
public class VendingMachineServiceImpl implements VendingMachineService{
	@Autowired
	VendingMachineRepository vendingmachinerepository;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return vendingmachinerepository.getAllProducts();
	}
	
	@Override
	public Product buyProduct(Integer id, Integer amount) {
		return vendingmachinerepository.buyProduct(id,amount);
	}
}
