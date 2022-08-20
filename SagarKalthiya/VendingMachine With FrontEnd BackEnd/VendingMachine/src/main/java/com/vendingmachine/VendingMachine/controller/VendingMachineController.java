package com.vendingmachine.VendingMachine.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;
import com.vendingmachine.VendingMachine.service.VendingMachineService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VendingMachineController {
	
	@Autowired
	VendingMachineService vendingMachineService;
	
	@RequestMapping(path = "/addProducts" , method = RequestMethod.POST)
	public @ResponseBody VendingMachineDomain saveStudent(@RequestBody VendingMachineDomain vendingmachine) {
		return vendingMachineService.addProduct(vendingmachine);
	}
	
	@RequestMapping(path = "/getAllProducts" , method = RequestMethod.GET)
	public @ResponseBody List<VendingMachineDomain> getResult(){
		return vendingMachineService.getResult();
	}
	
	@RequestMapping(path="/getProduct",method = RequestMethod.GET)
	public HashMap<String,Object> getProduct(
			@RequestParam("productId")  int productId,
			@RequestParam("userAmount")int userAmount) {
		
		return vendingMachineService.getProduct(productId, userAmount);
	}
	
	

}
