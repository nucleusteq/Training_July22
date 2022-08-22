package com.decorative;

public class Coffee {
	
		
		public static void main(String args[]) {
			
			Beverages beverage = new Espresso();
			beverage = new Mocha(beverage);
			System.out.println(beverage.getDescription() + "$" + beverage.cost());
			
			Beverages beverage1 = new HouseBlend();
			beverage1 = new Mocha(beverage1);
			beverage1= new Whip(beverage1);
			System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
			
		}
	}


