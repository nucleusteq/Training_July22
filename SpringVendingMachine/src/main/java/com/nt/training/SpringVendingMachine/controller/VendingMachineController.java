package com.nt.training.SpringVendingMachine.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.SpringVendingMachine.entities.VendingMachine;
import com.nt.training.SpringVendingMachine.service.MachineService;





@RestController
public class VendingMachineController {
	@Autowired
	private MachineService MachineService;
	@GetMapping("/home")
	public String home() {
		return "Welcome to the Vending machine";
		
	}
	
	@GetMapping("/Vend")
	public List<VendingMachine> getVendingMachine(){
		return this.MachineService.getVendingMachine();
	}
	
	@PostMapping("/Vend/{id}/{cash}")
	public @ResponseBody String displayVendingMachine(@PathVariable("id") int id,@PathVariable("cash") int cash) {
		return MachineService.displayVendingMachine(id,cash);
	}
}