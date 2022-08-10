package com.nt.training.vendormachine.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.vendormachine.VendingMachine.model.Product;
import com.nt.training.vendormachine.VendingMachine.service.VendingMachineService;

@RestController
public class VendingMachineController {
	@Autowired
	VendingMachineService vendingMachineService;
	
	@RequestMapping(path="/getAllProduct",method=RequestMethod.GET)
	public @ResponseBody List<Product> getAllProducts(){
//		System.out.println("OUTPUT");
		return vendingMachineService.getAllProducts();
	}
	
	@RequestMapping (path="/buy/{id}/{amount}",method=RequestMethod.GET)
	public @ResponseBody Product buyProduct(@PathVariable("id") Integer id ,
			@PathVariable("amount")  Integer amount){
		Product result = vendingMachineService.buyProduct(id,amount);
		return result;
}
}
