package com.vendorrest.vendorrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.vendorrest.vendorrest.entities.Item;


@Service
public class ItemServiceImpl implements ItemService {
	int checkId = 0;

	List<Item> list;
	
	public ItemServiceImpl() {
		list = new ArrayList<>();
		list.add(new Item(101, "Chocolate Cookie", 20));
		list.add(new Item(102,"Butterscotch Cookie", 35));
	}
	
	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Item getItem(long itemId) {
		// TODO Auto-generated method stub
		checkId = (int) itemId;
		Item i = null;
		int j = 0;
		int k = 0;
		
		
		for(Item item:list)
		{
			if(item.getId() == itemId)
			{
				i = item;
			
			}
		}
		return i; 
	}

	@Override
	public String getItemPrice(int Price) {
		// TODO Auto-generated method stub
		int s = 0;
		Item t = null;
		int u = 0;
		String v = "";
		String w = "";
		String x = "";
		for(Item item:list)
		{
			if(item.getId() == checkId)
			{
				if(item.getPrice() <= Price)
				{
					t = item;
					s = t.getPrice();
					u = Price - s;
					v =String.valueOf(u);  
					w = t.getName();		
					list.remove(item);
					return "Here is Your " + w + " and this is your change " + v + " rupees";
					
				}
				else
				{
					return "Entered amount is not sufficient please enter valid amount";
				}
			}
			
		}
		return null;
		
		
	}



}
