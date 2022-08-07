package com.vendorrest.vendorrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vendorrest.vendorrest.entities.Item;
import com.vendorrest.vendorrest.services.ItemService;

@RestController
public class MyController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to our vending maching";
	}

	@GetMapping("/items")
	public List<Item> getItem(){
		
		return this.itemService.getItems(); 
	}
	
	@GetMapping("/items/{itemId}")
	public Item getItem(@PathVariable String itemId) {
		return this.itemService.getItem(Long.parseLong(itemId));
	}
	
	@GetMapping("/items/{itemId}/{Price}")
	public String getItemPrice(@PathVariable int Price) {
		return this.itemService.getItemPrice(Price);
	}
	
}
