package com.nt.training.VendingMachine.domain;


public class VendingMachine {

	private Integer id;
	private String snackName;
	private Integer qtyAvailable;
	private Integer snackPrice;
	private String snackDesc;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSnackName() {
		return snackName;
	}
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}
	public Integer getQtyAvailable() {
		return qtyAvailable;
	}
	public void setQtyAvailable(Integer qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}
	public Integer getSnackPrice() {
		return snackPrice;
	}
	public void setSnackPrice(Integer snackPrice) {
		this.snackPrice = snackPrice;
	}
	public String getSnackDesc() {
		return snackDesc;
	}
	public void setSnackDesc(String snackDesc) {
		this.snackDesc = snackDesc;
	}
	public VendingMachine(Integer id, String snackName, Integer qtyAvailable, Integer snackPrice, String snackDesc) {
		super();
		this.id = id;
		this.snackName = snackName;
		this.qtyAvailable = qtyAvailable;
		this.snackPrice = snackPrice;
		this.snackDesc = snackDesc;
	}
	public VendingMachine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VendingMachine [id=" + id + ", snackName=" + snackName + ", qtyAvailable=" + qtyAvailable
				+ ", snackPrice=" + snackPrice + ", snackDesc=" + snackDesc + "]";
	}
	
}

