package com.training.VendingMachine.service;

import java.util.List;


import com.training.VendingMachine.domain.Item;

public interface VendingService {

	public List<Item>getAllItem();

	public  String buyItem(Integer id, Integer cash);
	
}
