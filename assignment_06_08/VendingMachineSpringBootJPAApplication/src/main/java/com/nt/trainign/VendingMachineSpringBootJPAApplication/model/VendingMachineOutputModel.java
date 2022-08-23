package com.nt.trainign.VendingMachineSpringBootJPAApplication.model;

import java.util.HashMap;

public class VendingMachineOutputModel {
	
	private String message;
	private HashMap<String,Integer> denomination;
	private int itemId;
	private int price;
	
	
	
	public VendingMachineOutputModel() {
		
	}

	public VendingMachineOutputModel(String message, HashMap<String, Integer> denomination, int itemId, int price) {
		this.message = message;
		this.denomination = denomination;
		this.itemId = itemId;
		this.price = price;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HashMap<String, Integer> getDenomination() {
		return denomination;
	}

	public void setDenomination(HashMap<String, Integer> denomination) {
		this.denomination = denomination;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "VendingMachineOutputModel [message=" + message + ", denomination=" + denomination + ", itemId=" + itemId
				+ ", price=" + price + "]";
	}
	
	
	
	

}
