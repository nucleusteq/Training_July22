package com.vendingmachine.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vendingmachine.VendingMachine.domain.VendingMachineDomain;
import com.vendingmachine.VendingMachine.service.VendingMachineService;

@RestController
public class VendingMachineController {
	
	@Autowired
	VendingMachineService vendingMachineService;
	
	@RequestMapping(path = "getAllProducts" , method = RequestMethod.GET)
	public @ResponseBody List<VendingMachineDomain> getProductList(){
		return vendingMachineService.getProductList();
	}
	
	@RequestMapping(path = "/getMyProduct" ,  method=RequestMethod.GET)
	public List<VendingMachineDomain> getMyProduct(
			@RequestParam("productId") int productId,
			@RequestParam("userAmount") int userAmount){
		return vendingMachineService.getMyProduct(productId, userAmount);
	}

}
