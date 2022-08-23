package com.nt.trainign.VendingMachineSpringBootJPAApplication.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "vending_machine")
public class VendingMachine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serial_number")
	private int serialNumber;
	
	@Column(name="balance")
	private int balance;
	
	
	@OneToMany(targetEntity = Product.class,cascade =CascadeType.ALL)
	@JoinColumn(name="vending_machine_serial_number",referencedColumnName = "serial_number")
	private List<Product> products;
	
	public VendingMachine() {
//		balance=1000;
//		serialNumber=1012;
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
