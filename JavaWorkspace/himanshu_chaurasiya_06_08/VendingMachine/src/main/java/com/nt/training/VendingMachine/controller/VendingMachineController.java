package com.nt.training.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.VendingMachine.domain.ResponseClass;
import com.nt.training.VendingMachine.domain.VendingMachine;
import com.nt.training.VendingMachine.service.VendingMachineService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VendingMachineController {
	
	@Autowired
	VendingMachineService vendingMachineService;
	
	
	@RequestMapping (path="/add",method=RequestMethod.POST)
	public @ResponseBody VendingMachine addProduct(@RequestBody VendingMachine vendingMach) {
		return vendingMachineService.addProducts(vendingMach);
	}
	
	@RequestMapping(path="/getProducts", method=RequestMethod.GET)
	public @ResponseBody List<VendingMachine> getAllProducts(){
		return vendingMachineService.getAllProduts();
	}
	
	@RequestMapping (path="/buy",method=RequestMethod.GET)
	public @ResponseBody ResponseClass buyProduct(@RequestParam(name = "id") Integer id, @RequestParam Integer amount) {
		ResponseClass result = vendingMachineService.buyProduct(id,amount);
		return result;
	}
}
