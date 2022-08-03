package com.springcore.lifecycle;

public class Laptop {
private double price;
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	System.out.println("Setting Price");
	this.price = price;
}
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Laptop [price=" + price + "]";
}
public void Hello()
{
	System.out.println("Inside init: Hello");
	
}
public void ByeBye() {
	System.out.println("Inside destroy: ByeBye");
}


}
 