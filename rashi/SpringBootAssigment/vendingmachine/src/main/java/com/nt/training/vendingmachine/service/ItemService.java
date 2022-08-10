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
		items.add(new Item(1, "chips", 10.0, "crunchy chips", 18));
		items.add(new Item(2, "kurkure", 15.0, "bakes crunchy snacks", 5));
		items.add(new Item(3, "amul lassi", 20.0, "tasty soft drink ", 12));
		items.add(new Item(4, "amul dudh", 30.0, "packed flavoured milk", 14));
		items.add(new Item(5, "Punjabi Tadka", 20.0, "soya sticks", 1));
	}
	
	public List<Item> getAllItems() {
		return items;
	}
	
	public Message buyItem(Input input) {
		Message message = new Message();
		for (Item item: items) {
			if (item.getId() == input.getId()) {
				if (item.getQuantity() == 0) {
					message.setMessage( "item empty" );
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
					message.setMessage("ye " + item.getPrice() + " more money is needed ");
					break;
				}
			}
		}
		if (message.getMessage() == null) {
			message.setMessage(" enter item id lesser than equal to 5"); 
		}
		return message;
	}
	
}
