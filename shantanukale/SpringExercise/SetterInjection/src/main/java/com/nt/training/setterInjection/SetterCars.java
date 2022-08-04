package com.nt.training.setterInjection;

public class SetterCars {
	private int model_no;
	private String car_name;
	private String owner;
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void result() {
		System.out.println("Car model "+car_name+" of model number "+model_no+" is owned by "+owner);
	}
}
