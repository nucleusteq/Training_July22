package com.SpringBoot.SpringBootFirst.app.Domain;
public class Product {
	
	public Product(Integer id, String name, Integer price, String description, Integer quantity) {
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		this.description=description;
		this.quantity=quantity;
		
	}
	public Product() {
		super();
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", quantity=" + quantity + "]";
	}


	private Integer id;
	private String name;
	private Integer price;
	private String description;
	private Integer quantity;
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
