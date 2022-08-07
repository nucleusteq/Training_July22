package com.vendingmachine.VendingMachine.service;

import java.util.List;

import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;

public interface VendingMachineService {
	
	public List<VendingMachineDomain> getProductList();
	public List<VendingMachineDomain> getMyProduct(int peoductId , int userAmount);

}
