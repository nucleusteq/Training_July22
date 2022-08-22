package com.decorative;

 class Whip extends CondimentDecorator {
	 private Beverages beverage;

	

	    Whip(Beverages beverage) {
	        this.beverage = beverage;
	    }

	    public String getDescription() {
	        return beverage.getDescription() + ", Whip";
	    }

	    @Override
	    public double cost() {
	        return beverage.cost() + 0.5D;
	    }
	}


