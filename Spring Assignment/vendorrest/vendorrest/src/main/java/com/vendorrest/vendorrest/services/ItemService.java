package com.vendorrest.vendorrest.services;

import java.util.List;

import com.vendorrest.vendorrest.entities.Item;

public interface ItemService {

	public List<Item> getItems();
	
	public Item getItem(long itemId);


	public String getItemPrice(int price);
}
