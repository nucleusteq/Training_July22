package com.nt.training.SetterInjection;

public class Office {

	private String name;
	
	private Employee employee;
	
	public Office() {
		super();
	}

	public Office(String name, Employee employee) {
		super();
		this.name = name;
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Office [name=" + name + ", employee=" + employee + "]";
	}
	
	
	
	
	
}
