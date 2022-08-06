package com.nt.training.VendingMachine.domain;


public class ResponseClass {

	private String status=null;
	private String denomination=null;
	private String snack=null;
	private Integer price=null;
	private String description=null;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getSnack() {
		return snack;
	}
	public void setSnack(String snack) {
		this.snack = snack;
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
	public ResponseClass(String status, String denomination, String snack, Integer price, String description) {
		super();
		this.status = status;
		this.denomination = denomination;
		this.snack = snack;
		this.price = price;
		this.description = description;
	}
	public ResponseClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseClass [status=" + status + ", denomination=" + denomination + ", snack=" + snack + ", price="
				+ price + ", description=" + description + "]";
	}
	
	
}


