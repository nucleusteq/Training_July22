package com.vendingmachine.VendingMachine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;
import com.vendingmachine.VendingMachine.repository.impl.VendingMachineRepositoryImpl;
import com.vendingmachine.VendingMachine.service.VendingMachineService;

@Service
public class VendingMachineServiceImpl implements VendingMachineService{

	@Autowired
	VendingMachineRepositoryImpl vendingMachineRepo;

	@Override
	public List<VendingMachineDomain> getProductList() {
		// TODO Auto-generated method stub
		return vendingMachineRepo.getProductList();
	}

	@Override
	public List<VendingMachineDomain> getMyProduct(int peoductId, int userAmount) {
		// TODO Auto-generated method stub
		return vendingMachineRepo.getMyProduct(peoductId, userAmount); 
	}

	@Override
	public String getResult(Integer pId, Integer uAmount) {
		// TODO Auto-generated method stub
		return vendingMachineRepo.getResult(pId, uAmount);
	}


	
	

}
