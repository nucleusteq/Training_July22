package com.nt.training.SpringVendingMachine.entities;

public class VendingMachine {
	private int id;
	private String name;
	private int price;
	private int quantity;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	
	@Override
	public String toString() {
		return "VendingMachine [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public VendingMachine(int id, String name, int price,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity= quantity;
		
	}
	public VendingMachine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}