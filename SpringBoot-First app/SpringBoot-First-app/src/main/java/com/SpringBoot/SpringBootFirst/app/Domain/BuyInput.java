package com.SpringBoot.SpringBootFirst.app.Domain;

public class BuyInput {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String name;
	public Integer amount;
}
