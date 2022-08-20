package com.vendingmachine.VendingMachine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allproductlist")
public class VendingMachineDomain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productPrice")
	private int productPrice;
	@Column(name = "productQuntity")
	private int productQuntity;
	@Column(name = "productDescription")
	private String productDescription;
	public VendingMachineDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VendingMachineDomain(int productId, String productName, int productPrice, int productQuntity,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuntity = productQuntity;
		this.productDescription = productDescription;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuntity() {
		return productQuntity;
	}
	public void setProductQuntity(int productQuntity) {
		this.productQuntity = productQuntity;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	@Override
	public String toString() {
		return "VendingMachineDomain [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQuntity=" + productQuntity + ", productDescription=" + productDescription
				+ "]";
	}
	
	
	

}
