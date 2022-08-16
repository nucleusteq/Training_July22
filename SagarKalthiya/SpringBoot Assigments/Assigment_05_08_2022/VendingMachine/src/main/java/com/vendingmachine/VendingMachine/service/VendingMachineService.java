package com.vendingmachine.VendingMachine.service;

import java.util.HashMap;
import java.util.List;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;

public interface VendingMachineService {
	
	public  List<VendingMachineDomain> getResult();
	public VendingMachineDomain addProduct(VendingMachineDomain vendingmachine) ;
	public HashMap<String, Object> getProduct(int peoductId , int userAmount);

}
