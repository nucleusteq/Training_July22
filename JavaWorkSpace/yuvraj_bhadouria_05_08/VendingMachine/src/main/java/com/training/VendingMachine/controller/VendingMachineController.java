package com.training.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.VendingMachine.domain.Item;
import com.training.VendingMachine.service.VendingService;


@RestController
public class VendingMachineController {
	
	@Autowired
	Private VendingService vendingService;
	
	@RequestMapping(path="/getItem",method=RequestMethod.GET)
	public @ResponseBody List<Item> getAllItem(){
		return vendingService.getAllItem();
	}
	

	@RequestMapping(path = "/update/{id}/{cash}" , method = RequestMethod.POST)
	public @ResponseBody String buyItem(@PathVariable("id") Integer id ,@PathVariable("cash") Integer cash) {
			return vendingService.buyItem(id,cash);
			
	}
}
