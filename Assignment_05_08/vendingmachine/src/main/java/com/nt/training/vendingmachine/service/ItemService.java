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
		items.add(new Item(1, "lays", 10.0, "thin crispy chips", 10));
		items.add(new Item(2, "kurkure", 15.0, "crunchy puffcorn snacks", 8));
		items.add(new Item(3, "maggie", 15.0, "packed noodles", 12));
		items.add(new Item(4, "dairy milk", 30.0, "rich milk chocolate", 5));
		items.add(new Item(5, "Punjabi Tadka", 20.0, "spicy soyasticks", 30));
		items.add(new Item(6, "pop corn", 10.0, "poped corn with cheese", 15));
		items.add(new Item(7, "cookies", 25.0, "Choco biscuit filled with liquid chocolate", 5));
		items.add(new Item(8, "kitkat", 20.0, "chocolate coverd wafer bar", 25));
		items.add(new Item(9, "coca cola", 40.0, "carbonated soft drink", 15));
	}
	
	public List<Item> getAllItems() {
		return items;
	}
	
	public Message buyItem(Input input) {
		Message message = new Message();
		for (Item item: items) {
			if (item.getId() == input.getId()) {
				if (item.getQuantity() == 0) {
					message.setMessage("Itne out of stock" + input.getInputPrice() + " : Money to be returned");
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
					message.setMessage(" Item listed for :" + item.getPrice() + " Please give more money for selected item... " + input.getInputPrice() + " : money to be returned");
					break;
				}
			}
		}
		if (message.getMessage() == null) {
			message.setMessage("Item ID is invalid, please enter valid ID");
		}
		return message;
	}
	
}
