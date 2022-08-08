package com.nt.training.VendingMachine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.training.VendingMachine.service.VendorService;
import com.nt.training.VendingMachine.vendor.Vendor;

@RestController
@RequestMapping(path = "api/v1/vendingmachine")
public class VendorController {
	
	private final VendorService vendorService;
	
	@Autowired
	public VendorController(VendorService vendorService) {
		this.vendorService = vendorService;
	}


	@GetMapping
	public List<Vendor> getItems(){
		return vendorService.getItems();
	}
}
