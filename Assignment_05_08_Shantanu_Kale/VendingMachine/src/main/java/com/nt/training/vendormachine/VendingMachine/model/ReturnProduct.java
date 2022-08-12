package com.nt.training.vendormachine.VendingMachine.model;

public class ReturnProduct {
	private String status;
	private String denomination;
	private int itemid;
	private int itemprice;
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
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	public ReturnProduct(String status, String denomination, int itemid, int itemprice) {
		super();
		this.status = status;
		this.denomination = denomination;
		this.itemid = itemid;
		this.itemprice = itemprice;
	}
	public ReturnProduct() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReturnProduct [status=" + status + ", denomination=" + denomination + ", itemid=" + itemid
				+ ", itemprice=" + itemprice + "]";
	}
	
	
}
