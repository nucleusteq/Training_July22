package com.nt.trainign.VendingMachineSpringBootApplication.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class VendingMachine {
	private int serialNumber;
	private int balance;
	private List<Product> products;
	
	public VendingMachine() {
		balance=1000;
		serialNumber=1012;
	}
	
	@Autowired
	public VendingMachine(List<Product> products) {
		this.products = products;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "VendingMachine [serialNumber=" + serialNumber + ", balance=" + balance + ", products=" + products + "]";
	}
	
	
	
}
