package com.nt.training.VendingMachine.Service;


import java.util.List;

//import com.springboot.VendingMachine.entities.VendingMachine;

public interface VendingMachineService {


	public List<items> getVendingMachine();

	public String displayVendingMachine(int id, int cash);
}
