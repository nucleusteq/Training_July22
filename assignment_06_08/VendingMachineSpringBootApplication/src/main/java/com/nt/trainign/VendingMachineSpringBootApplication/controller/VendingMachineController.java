package com.nt.trainign.VendingMachineSpringBootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.trainign.VendingMachineSpringBootApplication.model.Product;
import com.nt.trainign.VendingMachineSpringBootApplication.model.VendingMachineOutputModel;
import com.nt.trainign.VendingMachineSpringBootApplication.service.impl.VendingMachineServiceImpl;

@RestController
public class VendingMachineController {

	@Autowired
	VendingMachineServiceImpl vendingMachineService;
	
	@RequestMapping(path="/getAllProducts",method = RequestMethod.GET)
	public @ResponseBody List<Product> getAllProducts(){
		return vendingMachineService.getAllProducts();
	}
	
	@RequestMapping(path="/buyProduct",method=RequestMethod.POST)
	public @ResponseBody VendingMachineOutputModel sellProduct(@RequestParam("id") int id,@RequestParam("money") int money) {
		
		return vendingMachineService.sellProduct(id, money);
	}
}
