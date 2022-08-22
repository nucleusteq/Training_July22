package com.decorative;

abstract class Beverages {
	String description = "Beverages";
	
	String getDescription() {
		return description;
	}
	public abstract double cost();
}
