package com.nt.trainign.VendingMachineSpringBootJPAApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "expiry_date")
	private String expirtyDate;
	
	@Column(name="quantity")
	private int quantity;
	
	
	public Product() {
	
	}

	public Product(int id, String name, String description, int price, String expirtyDate,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.expirtyDate = expirtyDate;
		this.quantity=quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpirtyDate() {
		return expirtyDate;
	}

	public void setExpirtyDate(String expirtyDate) {
		this.expirtyDate = expirtyDate;
	}

	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", expirtyDate=" + expirtyDate + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
