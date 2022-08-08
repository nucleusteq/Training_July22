package com.nt.training.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.VendingMachine.entities.Items;
import com.nt.training.VendingMachine.service.MachineService;

@RestController
@RequestMapping("/vending-machine")
public class VendingMachineController {
	@Autowired
	private MachineService machineService;
	
	//get the items
	@GetMapping("/items")
	public List<Items> getItems(){
		return this.machineService.getItems();
		
	}
	@GetMapping("/items/{itemId}/{price}")
	public ResponseEntity<?> getItem(@PathVariable("itemId") Integer itemId,@PathVariable("price") Integer price){
		return this.machineService.getItem(itemId, price);
		
	}

	@PostMapping(path ="/add-item")
	public  Items addItem( @RequestBody Items item) {
		return this.machineService.addItem(item);
		
	}
	
	
}
