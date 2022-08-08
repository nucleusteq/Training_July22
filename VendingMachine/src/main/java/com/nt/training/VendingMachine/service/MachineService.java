package com.nt.training.VendingMachine.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.nt.training.VendingMachine.entities.Items;

public interface MachineService {
	
	public List<Items> getItems();

	public ResponseEntity<?> getItem(Integer itemId,Integer price);

	public Items addItem(Items item);

}
