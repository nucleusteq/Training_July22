package com.nt.training.VendingMachine.vendor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Vendor {
	
	@Id
	@SequenceGenerator(
			name = "vendor_sequence",
			sequenceName = "vendor_sequence",
			allocationSize = 1)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "vendor_sequence")
	
	private Long id;
	private String name;
	private int price;
	private int qty;
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	public Vendor(Long id, String name, int price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public Vendor(String name, int price, int qty) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	
}
