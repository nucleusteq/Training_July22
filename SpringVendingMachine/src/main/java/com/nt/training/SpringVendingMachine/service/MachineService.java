package com.nt.training.SpringVendingMachine.service;

import java.util.List;

import com.nt.training.SpringVendingMachine.entities.VendingMachine;


public interface MachineService {


	public List<VendingMachine> getVendingMachine();

	public String displayVendingMachine(int id, int cash);
}