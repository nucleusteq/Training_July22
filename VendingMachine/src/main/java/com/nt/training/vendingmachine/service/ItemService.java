package com.nt.training.vendingmachine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.training.vendingmachine.entity.Input;
import com.nt.training.vendingmachine.entity.Item;
import com.nt.training.vendingmachine.entity.Message;

@Service
public class ItemService {
	
	List<Item> items = new ArrayList<>();
	
	{
		items.add(new Item(1, "ThumbsUp", 20.0, "Thumbsup taste the thunder",10));
		items.add(new Item(2, "DairyMilk ", 20.0, "Brand Cadbury",10));
		items.add(new Item(3, "kitkat", 40.0, "have a kitkat break",10));
		items.add(new Item(4, "Munch", 10.0, "sweet",10));
		items.add(new Item(5, "GoodDay", 20.0, "Have a GoodDay",10));
		items.add(new Item(6, "Silk", 80.0, "Smooth And Silky",10));
		items.add(new Item(7, "Fanta", 50.0, "Fantastic Fanta",10));
		items.add(new Item(8, "Perk", 10.0, "Perk",10));
		items.add(new Item(9, "Water Bottle", 30.0, "Stay Hydrated",10));
		items.add(new Item(10, "Milky Bar", 20.0, "Milky Bar",10));
	}
	
	public List<Item> getAllItems() {
		return items;
	}
	
	public Message buyItem(Input input) {
		Message message = new Message();
		for (Item item: items) {
			if (item.getId() == input.getId()) {
				if (item.getQuantity() == 0) {
					message.setMessage("Item out of stock. Please take your money back.");
					break;
				}
				if (input.getInputPrice() >= item.getPrice()) {
					item.setQuantity(item.getQuantity() - 1);
					message.setItem(item);
					message.setItemPrice(item.getPrice());
					message.setInputAmount(input.getInputPrice());
					message.setMessage("Your remaining amount is: " + (input.getInputPrice() - item.getPrice()));
					message.setReturnAmount(input.getInputPrice() - item.getPrice());
					break;
				} else {
					message.setMessage("This item if of " + item.getPrice() + "amount. Please input more amount or take this " + input.getInputPrice() + "amount back.");
					break;
				}
			}
		}
		if (message.getMessage() == null) {
			message.setMessage("Item not availabe.");
		}
		return message;
	}	
}