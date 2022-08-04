package com.clearn.logic;


public class EmployeeLogicImpl {
	private int id;
	private String name;
	public EmployeeLogicImpl() {

	}
	public EmployeeLogicImpl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "EmployeeLogicImpl [id=" + id + ", name=" + name + "]";
	}
	
	
}
