package com.springboot.VendingMachine.service;

import java.util.List;

import com.springboot.VendingMachine.entities.VendingMachine;

public interface VendingMachineService {


	public List<VendingMachine> getVendingMachine();

	public String displayVendingMachine(int id, int cash);
}
