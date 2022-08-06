package com.nt.training.VendingMachine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;
import com.nt.training.VendingMachine.repository.VendingMachineRepository;
import com.nt.training.VendingMachine.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService {

	@Autowired
	VendingMachineRepository vendingMachineRepository;
	
	@Override
	public List<VendingMachine> getAllProduts() {
		return vendingMachineRepository.getAllProducts();
	}

	@Override
	public ResponseClass buyProduct(Integer id, Integer amount) {
		return vendingMachineRepository.buyProduct(id,amount);
	}

}
