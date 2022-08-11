package com.nt.training.VendingMachine.service;

import java.util.List;

import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;

public interface VendingMachineService {

	public List<VendingMachine> getAllProduts();

	public ResponseClass buyProduct(Integer id, Integer amount);

	public VendingMachine addProducts(VendingMachine vendingMach);

}
