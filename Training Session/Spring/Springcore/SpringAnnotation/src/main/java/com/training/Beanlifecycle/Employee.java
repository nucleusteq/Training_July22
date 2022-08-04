package com.training.Beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
