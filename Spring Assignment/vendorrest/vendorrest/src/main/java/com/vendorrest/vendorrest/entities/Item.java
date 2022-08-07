package com.vendorrest.vendorrest.entities;

public class Item {

	private long id;
	private String name;
	private int price;
	public Item(long id, String name, int price) {
		super();
		this.id= id;
		this.name = name;
		this.price = price;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
}

