package com.nt.training.vendingmachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.vendingmachine.entity.Input;
import com.nt.training.vendingmachine.entity.Item;
import com.nt.training.vendingmachine.entity.Message;
import com.nt.training.vendingmachine.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/get-all-items", method = RequestMethod.GET)
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	@RequestMapping(value = "/buy-item", method = RequestMethod.POST)
	public Message buyItem(@RequestBody Input input) {
		return itemService.buyItem(input);
	}
	

}
