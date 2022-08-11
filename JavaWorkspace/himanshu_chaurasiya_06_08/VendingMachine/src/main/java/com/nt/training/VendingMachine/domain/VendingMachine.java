package com.nt.training.VendingMachine.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_details")
public class VendingMachine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="snack_name")
	private String snackName;
	
	@Column(name="snack_quantity")
	private Integer qtyAvailable;
	
	@Column(name="snack_price")
	private Integer snackPrice;
	
	@Column(name="snack_description")
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

