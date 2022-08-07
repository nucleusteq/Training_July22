package com.beanlifeCycle;

public class LifeCycleXml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "LifeCycleXml [price=" + price + "]";
	}

	public LifeCycleXml() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("the method is destroyed");
	}
	

}
