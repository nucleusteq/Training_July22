package com.vendingmachine.VendingMachine.domain;

public class VendingMachineDomain {
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuntity;
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
