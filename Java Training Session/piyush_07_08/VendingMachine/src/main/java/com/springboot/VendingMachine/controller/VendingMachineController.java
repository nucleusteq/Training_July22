package com.springboot.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.VendingMachine.entities.VendingMachine;
import com.springboot.VendingMachine.service.VendingMachineService;

@RestController
public class VendingMachineController {
	@Autowired
	private VendingMachineService vendingMachineService;
	@GetMapping("/home")
	public String home() {
		return "Welcome to the Vending machine";
		
	}
	
	@GetMapping("/Vend")
	public List<VendingMachine> getVendingMachine(){
		return this.vendingMachineService.getVendingMachine();
	}
	
	@PostMapping("/Vend/{id}/{cash}")
	public @ResponseBody String displayVendingMachine(@PathVariable("id") int id,@PathVariable("cash") int cash) {
		return vendingMachineService.displayVendingMachine(id,cash);
	}
}
