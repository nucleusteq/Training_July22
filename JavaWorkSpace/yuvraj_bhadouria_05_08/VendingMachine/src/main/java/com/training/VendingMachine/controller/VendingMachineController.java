package com.training.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.VendingMachine.domain.Item;
import com.training.VendingMachine.service.VendingService;

@RestController
public class VendingMachineController {

	@Autowired
	private VendingService vendingService;

	@RequestMapping(path = "/getItem", method = RequestMethod.GET)
	public List<Item> getAllItem() {
		return vendingService.getAllItem();
	}

	@RequestMapping(path = "/update/{id}/{cash}", method = RequestMethod.POST)
	public String buyItem(@PathVariable("id") Integer id, @PathVariable("cash") Integer cash) {
		return vendingService.buyItem(id, cash);

	}
}
