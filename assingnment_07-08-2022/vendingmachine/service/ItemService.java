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
		items.add(new Item(1, "Monaco", 30.0, "Brand Parle salted", 15));
		items.add(new Item(2, "DairyMilk ", 20.0, "Brand Cadbury", 25));
		items.add(new Item(3, "KitKat", 40.0, "Brand Nestle",25));
		items.add(new Item(4, "Salted Potato Chips", 10.0, "Brand Balaji ", 25));
		items.add(new Item(5, "Real Juice", 20.0, "Brand Dabur", 35));
		items.add(new Item(6, "Good Day", 20.0, "Brand Britannia", 45));
		items.add(new Item(7, "Butter Milk", 10.0, "Brand Paper Boat ", 15));
		items.add(new Item(8, "Thumsup", 10.0, "Brand Coca-cola", 25));
		items.add(new Item(9, "Fanta", 10.0, "Brand Slice", 25));
		items.add(new Item(10, "Frooti", 10.0, "Brand parle",25));
	}
	
	public List<Item> getAllItems() {
		return items;
	}
	
	public Message buyItem(Input input) {
		Message message = new Message();
		for (Item item: items) {
			if (item.getId() == input.getId()) {
				if (item.getQuantity() == 0) {
					message.setMessage("Item Available " + input.getInputPrice() + " Empty");
					break;
				}
				if (input.getInputPrice() >= item.getPrice()) {
					item.setQuantity(item.getQuantity() - 1);
					message.setItem(item);
					message.setItemPrice(item.getPrice());
					message.setInputAmount(input.getInputPrice());
					message.setMessage("Your remaining amount : " + (input.getInputPrice() - item.getPrice()));
					message.setReturnAmount(input.getInputPrice() - item.getPrice());
					break;
				} else {
					message.setMessage("Item " + item.getPrice() + "The item price " + input.getInputPrice() + " cant but the item");
					break;
				}
			}
		}
		if (message.getMessage() == null) {
			message.setMessage("Item Unavailble");
		}
		return message;
	}
	
}
