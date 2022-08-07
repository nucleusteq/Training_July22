package com.vendingmachine.VendingMachine.repository;

import java.util.List;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;

public interface VendingMachineRepository {
	
	public List<VendingMachineDomain> getProductList();
	public List<VendingMachineDomain> getMyProduct(int peoductId , int userAmount);
	
}
