package com.decorative;

class Mocha extends CondimentDecorator {

	private Beverages beverage;

    Mocha(Beverages beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 2.4D ;
	} 

	

}
