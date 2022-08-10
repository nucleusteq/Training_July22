package com.nt.training.VendingMachine.domain;

import java.util.List;

public class ResponseClass {

	private String status=null;
	private Integer snackId=null;
	private String snack=null;
	private Integer price=null;
	private String description=null;
	private List<DenominationResponse> denomination=null;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getSnackId() {
		return snackId;
	}
	public void setSnackId(Integer snackId) {
		this.snackId = snackId;
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
	public List<DenominationResponse> getDenomination() {
		return denomination;
	}
	public void setDenomination(List<DenominationResponse> denomination) {
		this.denomination = denomination;
	}
	@Override
	public String toString() {
		return "ResponseClass [status=" + status + ", snackId=" + snackId + ", snack=" + snack + ", price=" + price
				+ ", description=" + description + ", denomination=" + denomination + "]";
	}
	public ResponseClass(String status, Integer snackId, String snack, Integer price, String description,
			List<DenominationResponse> denomination) {
		super();
		this.status = status;
		this.snackId = snackId;
		this.snack = snack;
		this.price = price;
		this.description = description;
		this.denomination = denomination;
	}
	public ResponseClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
		
}



