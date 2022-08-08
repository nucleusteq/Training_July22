package com.nt.training.VendingMachine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.training.VendingMachine.repository.VendorRepository;
import com.nt.training.VendingMachine.vendor.Vendor;

@Service
public class VendorService {
	private final VendorRepository vendorRepository;
	
	@Autowired
	public VendorService(VendorRepository vendorRepository) {
		this.vendorRepository = vendorRepository;
	}

	public List<Vendor> getItems(){
		return vendorRepository.findAll();
				
	}
}
