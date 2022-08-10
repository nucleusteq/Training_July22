package com.nt.training.constructorBean;

public class ConstructorInjection {
	private int order_id;
	private String shipping_address;
	
	public ConstructorInjection(int order_id, String shipping_address) {
		this.order_id=order_id;
		this.shipping_address=shipping_address;
	}
	public void show_order()
	{
		System.out.println("Order ID is "+order_id+" delivering to "+shipping_address);
	}
}
