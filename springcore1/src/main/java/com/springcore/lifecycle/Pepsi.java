package com.springcore.lifecycle;

public class Pepsi {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
   
	public void init()
	{
		System.out.println("Inside init method: heyy");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method: byee");
		}
}