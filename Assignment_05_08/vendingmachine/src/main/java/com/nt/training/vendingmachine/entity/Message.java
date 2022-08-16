package com.nt.training.vendingmachine.entity;

public class Message {
	
	private Item item;
	
	private String message;
	
	private Double inputAmount;
	
	private Double returnAmount;
	
	private Double itemPrice;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getInputAmount() {
		return inputAmount;
	}

	public void setInputAmount(Double inputAmount) {
		this.inputAmount = inputAmount;
	}

	public Double getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(Double returnAmount) {
		this.returnAmount = returnAmount;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	

}
