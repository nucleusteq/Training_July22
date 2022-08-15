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
		items.add(new Item(1, "Pepsi", 20.0, "Pepsi is a carbonated soft drink manufactured by PepsiCo.",10));
		items.add(new Item(2, "Maza", 15.0, "Maaza is a Coca-Cola fruit drink brand from India ",10));
		items.add(new Item(3, "Sprite", 40.0, "Sprite is a colorless, lemon and lime-flavored soft drink created by The Coca-Cola Company.",10));
		items.add(new Item(4, "Munch", 10.0, "Munch is an indulgent combination of crunchy wafer, creamy filling and a delicious chocolate coating which take your taste buds to another level.",10));
		items.add(new Item(5, "Dairy Milk", 20.0, "Dairy products are generally defined as food products that are produced from milk. ",10));
		items.add(new Item(6, "Silk", 80.0, "Silk is known for its beautiful drape and absorbent nature.",10));
		items.add(new Item(7, "Fanta", 50.0, "Fanta is a brand of fruit-flavored carbonated soft drinks created by Coca-Cola Deutschland under the leadership of German businessman Max Keith.",10));
		items.add(new Item(8, "Perk", 10.0, "Perk is a combination of crisp wafer and delicious Cadbury chocolate that enlivens the mood and sparks the lighter side of life. ",10));
		items.add(new Item(9, "Water Bottle", 30.0, "A water bottle is a container that is used to hold liquids.",10));
		items.add(new Item(10, "Milky Bar", 20.0, " It is a white chocolate confection produced by Nestlé since 1936 and sold worldwide. ",10));
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