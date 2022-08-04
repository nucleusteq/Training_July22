package com.nt.training.constructorBased;

import java.util.List;

public class Office {

	private String name;
	private List<Employee> employees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Office [name=" + name + ", employees=" + employees + "]";
	}
	public Office(String name, List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
